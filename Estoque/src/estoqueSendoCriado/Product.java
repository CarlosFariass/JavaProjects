package estoqueSendoCriado;

public class Product {
    
    public String name;
    public double price;
    public int quantity ;
    
        public double totalValueinStock() {
            return price * quantity;
                 
        }
        
        public void addProduct(int quantity) {    // void é porque nao retorna nada, //   
            this.quantity += quantity;   // this é uma palavra que referencia direto ao objeto// 
        }
        
        public void removeProduct(int quantity) {   // neste caso é para remover o produto do estoque (removeProduct)//
            this.quantity -= quantity;
        }
        
        public String toString() {
            return name
                + "  ; $"
                + String.format("%.2f", price)
                + " , "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueinStock());
        }
}

