import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { postBook } from '../services/BookService';
import { BookSchema } from '../schemas/Book';

interface BookFormProps {
    successCallback: () => void;
    errorCallback: () => void;
}

export default function BookForm({successCallback, errorCallback }: BookFormProps){
    const [postBookTitle,setpostBookTitle] = useState<string>('');
    const [postBookType,setpostBookType] = useState<string>('');
    // const [postBookSellerEmail,setpostBookSellerEmail] = useState<string>('');
    const [postBookSeller,setpostBookSeller] = useState<number>();
    // const [postBookAuthorName,setpostBookAuthorName] = useState<string>('');
    const [postBookAuthor,setpostBookAuthor] = useState<number>();
    const [postBookDescription,setpostBookDescription] = useState<string>('');
    // const [sellers, setSellers] = useState<Seller[]>([]);
    
    function handleTitleChange(event: React.ChangeEvent<HTMLInputElement>){
        setpostBookTitle(event.target.value)
    }
    function handleTypeChange(event: React.ChangeEvent<HTMLInputElement>){
        setpostBookType(event.target.value)
    }
    function handleSellerChange(event: React.ChangeEvent<HTMLInputElement>){
        const inputValue = event.target.value;
        const intValue = parseInt(inputValue, 10);
        if (!isNaN(intValue)) {
            setpostBookSeller(intValue);
        }
    }
    function handleAuthorChange(event: React.ChangeEvent<HTMLInputElement>){
        const inputValue = event.target.value;
        const intValue = parseInt(inputValue, 10);
        if (!isNaN(intValue)) {
            setpostBookAuthor(intValue);
        }
    }
    function handleDescriptionChange(event: React.ChangeEvent<HTMLInputElement>){
        setpostBookDescription(event.target.value)
    }

    function handleSubmit(event: React.ChangeEvent<HTMLFormElement>) {
        event.preventDefault();
        postBook({
            title: postBookTitle,
            bookType: postBookType,
            sellerId: postBookSeller,
            authorId: postBookAuthor,
            description: postBookDescription,
            forSale: true,
        } as BookSchema)
        .then(() => successCallback());
    }

    return (
        <form onSubmit={handleSubmit}>
            <input type="text" placeholder="Título" onChange={handleTitleChange}/>
            <input type="text" placeholder="Estado" onChange={handleTypeChange}/>
            <input type="text" placeholder="Vendedor" onChange={handleSellerChange}/>
            <input type="text" placeholder="Autor" onChange={handleAuthorChange}/>
            <input type="text" placeholder="Descrição" onChange={handleDescriptionChange}/>
            <button type="submit">Cadastrar</button>
        </form>
    );
}
