package nl.loxia.builder.generator.ap.test.builderchaining;

/**
 * Generated by RIGD-Loxia Builder generator
 */
public class BuilderChainingBuilder<PARENT> {
    private BuilderChainingChild value;
    private BuilderChainingChildBuilder<BuilderChainingBuilder<PARENT>> valueBuilder;

    private PARENT parent;

    public BuilderChainingBuilder() {
    }

    public BuilderChainingBuilder(PARENT parent) {
        this.parent = parent;
    }

    /**
     * If this is called after {@link #withValue()} then the Builder is lost.
     */
    public BuilderChainingBuilder<PARENT> withValue(BuilderChainingChild value) {
        this.value = value;
        valueBuilder = null;
        return this;
    }

    /**
     * returns a builder for chaining. Use the end() method to return back to the current builder.<BR>
     * Multiple calls to this method will return the same builder.<BR>
     * If this is called after {@link #withValue(BuilderChainingChild)} then this will return a new Builder and the previously set object is lost.
     */
    public BuilderChainingChildBuilder<? extends BuilderChainingBuilder<PARENT>> withValue() {
        if (valueBuilder == null) {
            valueBuilder = new BuilderChainingChildBuilder<>(this);
            value = null;
        }
        return valueBuilder;
    }

    /**
     * returns the build object. For builder chaining use the {@link #end()} method to return the parent builder.
     */
    public BuilderChaining build() {
        BuilderChaining result = new BuilderChaining();
        result.setValue(valueBuilder != null ? valueBuilder.build() : value);
        return result;
    }

    /**
     * returns the parent builder if present, otherwise null is returned.
     */
    public PARENT end() {
        return parent;
    }

    public static BuilderChainingBuilder<Void> copyOf(BuilderChaining bron) {
        if (bron == null) {
            return null;
        }
        BuilderChainingBuilder<Void> builder = new BuilderChainingBuilder<>();
        builder.valueBuilder = BuilderChainingChildBuilder.copyOf(bron.getValue(), builder);
        return builder;
    }

    public static <T> BuilderChainingBuilder<T> copyOf(BuilderChaining bron, T parentBuilder) {
        if (bron == null) {
            return null;
        }
        BuilderChainingBuilder<T> builder = new BuilderChainingBuilder<>(parentBuilder);
        builder.valueBuilder = BuilderChainingChildBuilder.copyOf(bron.getValue(), builder);
        return builder;
    }
}