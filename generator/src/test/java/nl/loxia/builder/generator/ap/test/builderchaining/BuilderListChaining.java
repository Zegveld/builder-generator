package nl.loxia.builder.generator.ap.test.builderchaining;

import java.util.ArrayList;
import java.util.List;

import nl.loxia.builder.generator.annotations.Builder;

@Builder
public class BuilderListChaining {
    private List<BuilderChainingChild> values = new ArrayList<>();

    public List<BuilderChainingChild> getValues() {
        return values;
    }

    public void setValues(List<BuilderChainingChild> values) {
        this.values = values;
    }
}
