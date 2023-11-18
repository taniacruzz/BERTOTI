export interface PostBookSchema {
    id: number,
    title: string,
    bookType: string,
    seller: { id: number }, 
    author: { id: number},
    description: string,
    forSale: boolean,
  }

  export interface GetBookSchema {
    id: number,
    title: string,
    bookType: string,
    seller: { name: string }, 
    author: { name: string},
    description: string,
    forSale: boolean,
  }