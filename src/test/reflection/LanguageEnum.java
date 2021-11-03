package test.reflection;



public enum LanguageEnum {
    LANGUAGE_CN( CustomerConstant.LANG_ZH, "简体中文", "label", "zh" ),
    LANGUAGE_CN_HANT( CustomerConstant.LANG_ZH_HANT, "繁體中文", "label_zh_hant", "zht" ),
    LANGUAGE_US( CustomerConstant.LANG_EN, "English", "label_en", "en" ),
    LANGUAGE_KR( CustomerConstant.LANG_KO, "한국어", "label_ko", "ko" ),
    LANGUAGE_ES( CustomerConstant.LANG_SPANISH, "Español", "label_es", "es" ),
    LANGUAGE_JA( CustomerConstant.LANG_JAPAN, "日本語", "label_ja", "ja" );

    private final String key;

    private final String label;

    private final String db_label;

    private final String url_base;

    public String getKey() {
        return key;
    }

    public String getLabel() {
        return label;
    }

    public String getDb_label() {
        return db_label;
    }

    public String getUrl_base() {
        return url_base;
    }

    LanguageEnum(String key, String label, String db_label, String url_base) {
        this.key = key;
        this.label = label;
        this.db_label = db_label;
        this.url_base = url_base;
    }

    public static LanguageEnum getLanguage(String key) {
        LanguageEnum[] languageMappingEnums = values();
        for ( LanguageEnum languageMappingEnum : languageMappingEnums ) {
            if ( languageMappingEnum.key.equals( key ) ) {
                return languageMappingEnum;
            }
        }
        return null;
    }
}
