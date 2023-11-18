
import axios, { AxiosResponse } from 'axios';
import { GetBookSchema, PostBookSchema } from '../schemas/Book';


const API_URL = 'http://127.0.0.1:8080/books';

async function mapResponse(response: AxiosResponse): Promise<GetBookSchema[]> {
    return response.data.map((item: any) => ({
        id: item.id ? item.id : "N/A",
        title: item.title ? item.title : "N/A",
        bookType: item.bookType ? item.bookType : "N/A",
        sellerId: item.sellerId ? item.sellerId : "N/A",
        authorId: item.authorId ? item.authorId : "N/A",
        description: item.description ? item.description : "N/A",
        forSale: item.forSale ? item.forSale : "N/A",
    })) as GetBookSchema[]
}

export async function postBook(book: PostBookSchema) {
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

export async function getBooks(): Promise<GetBookSchema[]> {
    const response = await axios.get(`${API_URL}`, {method: 'GET'});
    return await mapResponse(response);
}

export async function deleteBook(id: Number) {
    return await fetch(`${API_URL}/${id}`, {
        method: 'DELETE',
    });
    
}