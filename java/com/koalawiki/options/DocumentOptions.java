package com.koalawiki.options;

/**
 * 文档相关配置
 */
public class DocumentOptions {
    public static final String NAME = "Document";

    /** 是否启用增量更新 */
    public static boolean enableIncrementalUpdate = true;

    /** 排除的文件 */
    public static String[] excludedFiles = new String[0];

    /** 排除的文件夹 */
    public static String[] excludedFolders = new String[0];

    /** 是否启用智能过滤 */
    public static boolean enableSmartFilter = true;

    /** 是否启用代码依赖分析 */
    public static boolean enableCodeDependencyAnalysis = false;

    /** 是否启用仓库功能提示任务 */
    public static boolean enableWarehouseFunctionPromptTask = true;

    /** 是否启用仓库描述任务 */
    public static boolean enableWarehouseDescriptionTask = true;

    /** 是否启用文件提交 */
    public static boolean enableFileCommit = true;

    public static void initConfig(ConfigProvider configuration) {
        configuration.getSection(NAME, DocumentOptions.class); // 读取但不赋值，保留静态默认

        Boolean fileCommit = configuration.getBoolean("ENABLE_FILE_COMMIT");
        if (fileCommit != null) {
            enableFileCommit = fileCommit;
        }

        String incr = configuration.getString("ENABLE_INCREMENTAL_UPDATE");
        if (incr != null) {
            enableIncrementalUpdate = Boolean.parseBoolean(incr);
        }

        String dep = configuration.getString("ENABLE_CODED_DEPENDENCY_ANALYSIS");
        if (dep != null) {
            enableCodeDependencyAnalysis = Boolean.parseBoolean(dep);
        }

        String funcTask = configuration.getString("ENABLE_WAREHOUSE_FUNCTION_PROMPT_TASK");
        if (funcTask != null) {
            enableWarehouseFunctionPromptTask = Boolean.parseBoolean(funcTask);
        }

        String descTask = configuration.getString("ENABLE_WAREHOUSE_DESCRIPTION_TASK");
        if (descTask != null) {
            enableWarehouseDescriptionTask = Boolean.parseBoolean(descTask);
        }
    }

    public interface ConfigProvider {
        <T> T getSection(String name, Class<T> clazz);

        String getString(String key);

        Boolean getBoolean(String key);
    }
}
