package cashregister;

public class MockPrinter extends Printer{
    private String printThis="";
    @Override
    public void print(String printThis){
        {
            super.print(printThis);
            this.printThis=printThis;
            //throw new UnsupportedOperationException("Not Implemented");
        }
    }
    public String getTempText() {
            return printThis;
        }
}

