//wap to create a class furniture with instance variable "type" "material" "price" include a method to 
//calcluate the discount on furniture based on its material  and a method to print 
//the furniture type,material,discounted price
class Furniture{
	public String type;
	public String Material;
	public int price=0;
		public void Materialshow(String s,int p){
			System.out.println("The Type is" + s + "the discounted price is" + p )
		
}
		public int Discount(String mat){
			Material=mat;
			if (mat=="Glass")
			{
				price=price*0.1
				}
			else if(mat=="Wood"){
				
				price=price*0.5
				}
			else if(mat=="Marbel"){
				
					price=price*0.2;			
				}	
			else{
				System.out.println("The material is not available")
				}
			return price;
		}
			public void Type(String type){
				this.type
					if(type=="Table"){
						price=10000
						int b= Discount(Wood);
						Materialshow(type,b)
			}
				
					else if(type=="Cupboard"){
						price=15000
						int a =Discount(5000,Glass);
						Materialshow(type,a)	
}
		}	
						
	public static void main(String [] args){
		Furniture f = new Furniture();
		String t="Table";
		String m="Wood";
			f.Discount(t);
			System.out.pritnln(f.Type(m));
		 
}
}