import java.util.HashMap;
import java.util.TreeSet;

public class SymbolMap {
    private static SymbolMap instance = null;

    private HashMap<String, Integer> initialValues;
    private HashMap<String, Integer> registrerMap;

    private TreeSet<String> symbols;

    private SymbolMap()
    {
        this.initialValues = new HashMap<String, Integer>();
        this.registrerMap = new HashMap<String, Integer>();
        this.symbols = new TreeSet<String>();
    }

    public SymbolMap getInstance()
    {
        if (SymbolMap.instance != null) {
            return SymbolMap.instance;
        }

        SymbolMap.instance = new SymbolMap();
    }

    public void createNewVar(String name)
    {
        this.symbols.add(new String(name));
    }

    public void createNewVar(String name, Integer initialValue)
    {
        this.symbols.add(new String(name));
        this.initialValues.put(new String(name), new Integer(initialValue));
    }

    public void setInitialValue(String name, Integer initialValue)
    {
        this.initialValues.put(new String(name), new Integer(initialValue));
    }

    public Integer getInitialValue(String name)
    {
        return new Integer(this.initialValues.get(name));
    }
}
