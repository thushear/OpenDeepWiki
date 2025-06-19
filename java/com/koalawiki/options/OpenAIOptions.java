package com.koalawiki.options;

/**
 * OpenAI 相关配置
 */
public class OpenAIOptions {
    /** ChatGPT模型 */
    public static String chatModel = "";

    /** 分析模型 */
    public static String analysisModel = "";

    /** ChatGPT API密钥 */
    public static String chatApiKey = "";

    /** API地址 */
    public static String endpoint = "";

    /** 模型提供商 */
    public static String modelProvider = "";

    /** 最大文件限制 */
    public static int maxFileLimit = 10;

    /** 深度研究模型 */
    public static String deepResearchModel = "";

    /** 嵌入模型 */
    public static String embeddingsModel = "";

    public static void initConfig(ConfigProvider configuration) throws Exception {
        chatModel = trim(configuration.get("CHAT_MODEL", "ChatModel"));
        analysisModel = trim(configuration.get("ANALYSIS_MODEL", "AnalysisModel"));
        chatApiKey = trim(configuration.get("CHAT_API_KEY", "ChatApiKey"));
        endpoint = trim(configuration.get("ENDPOINT", "Endpoint"));
        modelProvider = trim(configuration.get("MODEL_PROVIDER", "ModelProvider"));
        deepResearchModel = trim(configuration.get("DEEP_RESEARCH_MODEL", "DeepResearchModel"));

        String max = configuration.get("MAX_FILE_LIMIT");
        if (max != null && !max.isEmpty()) {
            try {
                maxFileLimit = Integer.parseInt(max);
            } catch (NumberFormatException ignored) {
            }
        }

        embeddingsModel = trim(configuration.get("EMBEDDINGS_MODEL", "EmbeddingsModel"));

        if (modelProvider == null || modelProvider.isEmpty()) {
            modelProvider = "OpenAI";
        }

        if (chatModel == null || chatModel.isEmpty()) {
            throw new Exception("ChatModel is empty");
        }
        if (chatApiKey == null || chatApiKey.isEmpty()) {
            throw new Exception("ChatApiKey is empty");
        }
        if (endpoint == null || endpoint.isEmpty()) {
            throw new Exception("Endpoint is empty");
        }
        if (deepResearchModel == null || deepResearchModel.isEmpty()) {
            deepResearchModel = chatModel;
        }
        if (analysisModel == null || analysisModel.isEmpty()) {
            analysisModel = chatModel;
        }
    }

    private static String trim(String value) {
        return value == null ? "" : value.trim();
    }

    public interface ConfigProvider {
        String get(String... keys);
    }
}
