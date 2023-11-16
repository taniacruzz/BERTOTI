export interface BookSchema {
    id: number,
    title: string,
    bookType: string,
    sellerId: number, 
    authorId: number,
    description: string,
    forSale: boolean,
  }