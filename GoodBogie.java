class GoodsBogie 
{
    String type;
    String cargo;

    GoodsBogie(String type) 
    {
        this.type = type;
    }

    public void assignCargo(String cargo) 
    {
        try 
        {
            // Rule: Rectangular bogies cannot carry Petroleum
        	
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) 
            {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully -> " + cargo);
        } 
        catch (CargoSafetyException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Cargo validation completed for " + type + " bogie");
        }
    }
}
