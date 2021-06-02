package ex360;

public class Horoscopo {
    private int mesesESeusDias[]={31,28,31,30,31,30,31,31,30,31,30,31};
    private String[][] datasLimitesDosSignos={{"Capricornio","1901"},{"Aquario","1802"},
        {"Peixes","2003"},{"Aries","2004"},{"Touro","2005"},{"Gemeos","2006"},
        {"Cancer","2207"},{"Leao","2208"},{"Virgem","2209"},{"Libra","2210"},
        {"Escorpiao","2111"},{"Sagitario","2112"}};
    //Formato ddmm
    public Horoscopo(){}
    
    public String qualEOSigno(String dataAniversario){//Formato ddmm
        int dataAniversarioInt=Integer.parseInt(dataAniversario);
        int dia=dataAniversarioInt/100,mes=dataAniversarioInt%100;//Divisoes inteiras
        if(diaEMesSaoValidos(dia,mes)){
            switch(mes){
                case 1:
                    if(dia<=19) return "Capricornio";
                    return "Aquario";
                case 2:
                    if(dia<=18) return "Aquario";
                    return "Peixes";
                case 3:
                    if(dia<=20) return "Peixes";
                    return "Aries";
                case 4:
                    if(dia<=20) return "Aries";
                    return "Touro";
                case 5:
                    if(dia<=20) return "Touro";
                    return "Gemeos";
                case 6:
                    if(dia<=20) return "Gemeos";
                    return "Cancer";
                case 7:
                    if(dia<=22) return "Cancer";
                    return "Leao";
                case 8:
                    if(dia<=22) return "Leao";
                    return "Virgem";
                case 9:
                    if(dia<=22) return "Virgem";
                    return "Libra";
                case 10:
                    if(dia<=22) return "Libra";
                    return "Escorpiao";
                case 11:
                    if(dia<=21) return "Escorpiao";
                    return "Sagitário";
                case 12:
                    if(dia<=21) return "Sagitário";
                    return "Capricórnio";
                default:return "It'll never reach here...";
                /*A rotina do programa nunca chegará aqui,pois o dado mes foi 
                validado.Assim,se mes não for nenhum dos casos acima,ele não é
                um mês válido... o algoritmo será direcionado a retornar
                uma mensagem de erro. No entanto,para mostrar ao compilador,que
                uma string sempre será retornada deste método,foi preciso 
                incluir esse comando default.*/
            }
        }else return "Nao encontrado";
    }
    
    public boolean diaEMesSaoValidos(int dia,int mes){
        if(dia<=0||dia>31||mes<=0||mes>12) return false;
        /*Os meses que terminam com 31 dias já são validados no if acima. 
        Portanto,não entrarão no comando seguinte.*/
        switch(mes){
            case 2:
                if(dia>29) return false;//Fevereiro pode ter até 29 dias
                return true;
            case 4:
            case 6:
            case 9:
            case 11:
                if(dia>30) return false;
                return true;
                /*Como dito acima,os meses com 31 dias já são verificados no 
                primeiro comando if. Os meses com 30 dias são verificados nos
                comandos case 4,6,9 e 11.*/
        }
        return true;//Os meses com 31 dias chegarão até aqui.
    }
}
