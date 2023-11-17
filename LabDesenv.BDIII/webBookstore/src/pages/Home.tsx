import { Table } from 'antd';
import type { ColumnsType } from 'antd/es/table';
import { useEffect, useState } from 'react';
import BookForm from '../components/BookForm';
// import Popup, { PopupSchema } from '../components/PopUp';
import { BookSchema } from '../schemas/Book';

import { getBooks } from '../services/BookService';

interface HomeProps {
    successCallback: () => void;
    errorCallback: () => void;
}

export default function Books() {
    const [books, setBooks] = useState<BookSchema[]>([]);
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

    const columns: ColumnsType<BookSchema> = [
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
            dataIndex: 'sellerId',
            key: 'sellerId',
        },
        {
            title: 'Autor',
            dataIndex: 'authorId',
            key: 'authorId',
        },
        {
            title: 'Descrição',
            dataIndex: 'description',
            key: 'description',
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
