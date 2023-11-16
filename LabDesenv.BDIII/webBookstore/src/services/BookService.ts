
import axios from 'axios';
import { BookSchema } from '../schemas/Book';


const API_URL = 'http://127.0.0.1:8080/books';

export async function postBook(book: BookSchema) {
    return await fetch(API_URL, {
        method: 'POST',
        headers: {
            "Content-Type": 'application/json'
        },
        body: JSON.stringify(book)
    }).then(response=> response.json())
    .then((data)=> console.log(data))
    .catch(error => console.error(error));
    
}