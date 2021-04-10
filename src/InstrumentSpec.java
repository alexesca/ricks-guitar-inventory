import enums.Builder;
import enums.Type;
import enums.Wood;

public class InstrumentSpec {
    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;

    public InstrumentSpec(
            Builder builder, String model, Type type,
            Wood backWood, Wood topWood
    ) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder()
    {
        return builder;
    }
    public String getModel()
    {
        return model;
    }
    public Type getType()
    {
        return type;
    }
    public Wood getBackWood()
    {
        return backWood;
    }
    public Wood getTopWood()
    {
        return topWood;
    }

    public Boolean matches(InstrumentSpec otherSpec) {
        if (builder != otherSpec.builder)
            return false;
        if ((model != null) && (!model.equals("")) &&
                (!model.equals(otherSpec.model)))
            return false;
        if (type != otherSpec.type)
            return false;
        if (backWood != otherSpec.backWood)
            return false;
        if (topWood != otherSpec.topWood)
            return false;
        return true;
    }
}
