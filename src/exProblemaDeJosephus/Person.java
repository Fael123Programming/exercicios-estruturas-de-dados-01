package exProblemaDeJosephus;
public class Person {
    private String name,phone,address,cpf;
    
    public Person(String name,String phone,String address,String cpf){
        this.name=name;
        this.phone=phone;
        this.address=address;
        this.cpf=cpf;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        return String.format("Nome: %s\nTelefone: %s\nEndereço: %s\nCPF: %s\n",
                this.name,this.phone,this.address,this.cpf);
    }
}
