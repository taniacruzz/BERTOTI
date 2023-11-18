import { Table } from 'antd';
import type { ColumnsType } from 'antd/es/table';
import { useEffect, useState } from 'react';
import BookForm from '../components/BookForm';
// import Popup, { PopupSchema } from '../components/PopUp';
import { GetBookSchema, PostBookSchema } from '../schemas/Book';

import { deleteBook, getBooks } from '../services/BookService';

interface HomeProps {
    successCallback: () => void;
    errorCallback: () => void;
}

export default function Books() {
    const [books, setBooks] = useState<GetBookSchema[]>([]);
    // const [popupData, setPopupData] = useState<PopupSchema | null>(null);
    // const [showPopup, setShowPopup] = useState(false);

    const requestBooks = () => {
        getBooks().then((booksResponse) =>
            setBooks(booksResponse)
        );
    };

    useEffect(() => {
        requestBooks();
    }, []);

    function handleDeleteBook(id: Number){
        deleteBook(id);
        requestBooks();
    }

    const columns: ColumnsType<GetBookSchema> = [
        {
            title: 'Titulo',
            dataIndex: 'title',
            key: 'title',
        },
        {
            title: 'Conservação',
            dataIndex: 'bookType',
            key: 'bookType',
        },
        {
            title: 'Vendedor',
            dataIndex: 'seller',
            key: 'seller',
            render: (seller, record) => {
                return seller ? (<p>{seller.name}</p>) : (null);
            }
        },
        {
            title: 'Autor',
            dataIndex: 'author',
            key: 'author',
        },
        {
            title: 'Descrição',
            dataIndex: 'description',
            key: 'description',
           
        },
        {
            dataIndex: 'id',
            key: 'id',
            render: (id, record) => {
                return(                
                    <button onClick={() => handleDeleteBook(id)}>Excluir</button>
                )
            },
        },
        
        
        
    ];

    // const handleClose = () => {
    //     setShowPopup(false);
    // };

    return (
        <div>
            <BookForm
                
                successCallback={requestBooks}
                errorCallback={() => {}}
            />
            {books ? (
                <Table dataSource={books} columns={columns} />
            ) : null}

            {/* {showPopup && popupData && <Popup {...popupData} />} */}
        </div>
    );
}
