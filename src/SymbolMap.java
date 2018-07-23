public interface SymbolMap {
    public SymbolMap getInstance();
    public void createNewVar(String name);
    public void createNewVar(String name, Integer initialValue);
    public void setInitialValue(String name, Integer initialValue);
    public Integer getInitialValue(String name);
}
