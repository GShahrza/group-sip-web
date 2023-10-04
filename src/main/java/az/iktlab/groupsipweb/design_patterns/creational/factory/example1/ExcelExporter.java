package az.iktlab.groupsipweb.design_patterns.creational.factory.example1;

public class ExcelExporter implements FileExporter{
    @Override
    public String export(String content) {
        return "EXCEL -> " + content;
    }
}
