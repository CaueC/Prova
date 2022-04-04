public class CommoditiesAgro{

    public static void main(String[] args) {
        
        String commodities [] = new String [5];
        commodities[0] = "Arroz / 60 KG"; //60 KG
        commodities[1] = "Café / 60 KG"; //60 KG
        commodities[2] = "Carne (Boi Gordo) / 15 KG"; //Boi Gordo 15 KG
        commodities[3] = "Milho / 50 KG"; // 50 KG
        commodities[4] = "Soja / 60 KG"; // 60 KG

        double valores [] = new double [5];
        valores[0] = 89.00;
        valores[1] = 1236.00;
        valores[2] = 321.00;
        valores[3] = 110.00;
        valores[4] = 191.00;

        for (int index = 0; index < commodities.length; index++) {
            System.out.print("Commodities: ");
            System.out.println(commodities[index] + ": " + valores[index] + " R$");
            
        }
    }
}