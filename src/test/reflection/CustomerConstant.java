package test.reflection;


public final class CustomerConstant {

    public static final String STRING_DEFAULT = "";
    public static final Integer INT_DEFAULT = 0;
    public static final Integer INTEGER_MAX = 2147483647;
    
    public static final Integer TOKEN_EXPIRE_TIME = 2592000;
    public static final Integer TOKEN_VALID_TIME = 1296000;

    public static final String LANG_ZH = "zh";
    public static final String LANG_ZH_HANT = "zh-Hant";
    public static final String LANG_EN = "en";
    public static final String LANG_KO = "ko";
    public static final String LANG_SPANISH = "es";
    public static final String LANG_JAPAN = "ja";

    public static final String PLATFORM_IOS = "ios"; // 平台-ios
    public static final String PLATFORM_H5 = "h5"; // 平台-h5
    public static final String PLATFORM_PC = "pc"; // 平台-pc
    public static final String PLATFORM_ANDROID = "android"; // 平台-android
    
    public static final String LOGIN_TYPE_APPLE = "SY_AP";
    public static final String LOGIN_TYPE_EMAIL = "SY_WE";
    public static final String LOGIN_TYPE_WE_CHAT = "SY_WX";
    public static final String LOGIN_TYPE_FACEBOOK = "SY_FB";
    public static final String LOGIN_TYPE_GOOGLE = "SY_GG";
    public static final String LOGIN_TYPE_KA_KAO = "SY_KA";
    public static final String LOGIN_TYPE_PHONE = "SY_WP";
    
    public static final String COOKIE_SESSION_TOKEN = "weee_session_token";
    public static final String SESSION_PRE_ORDER_ID = "session_pre_order_id";

    public static final String ORDER_SHIPMENT_STATUS_PACKING = "preparing";
    public static final String ORDER_SHIPMENT_STATUS_IN_TRANSIT = "shipping";
    public static final String ORDER_SHIPMENT_STATUS_DELIVERED= "delivered";

    public static final String AFTER_SHIP_URL = "https://weee.aftership.com";

    public static final String META_CODE_BUNDLE_TYPE_DEFAULT = "Regular";
    public static final String META_CODE_BUNDLE_TYPE_HOT = "Hot";
    public static final String META_CODE_BUNDLE_TYPE_MORNING = "Morning";
    public static final String META_CODE_BUNDLE_TYPE_AFTERNOON = "Afternoon";

    public static final String WEEE_PRIVILEGE_ANONYMOUS = "anonymous";
    public static final String WEEE_PRIVILEGE_NORMAL = "normal";
    public static final String WEEE_PRIVILEGE_NORMAL_ADMIN = "normal_admin";
    public static final String WEEE_PRIVILEGE_MAIN_DATA_ADMIN = "main_data_admin";
    public static final String WEEE_PRIVILEGE_DEAL_VIEW = "deal_view";
    public static final String WEEE_PRIVILEGE_DEAL_VIEW_READONLY = "deal_view_readonly";
    public static final String WEEE_PRIVILEGE_DEAL_ADMIN = "deal_admin";
    public static final String WEEE_PRIVILEGE_DEAL_ADMIN_READONLY = "deal_admin_readonly";
    public static final String WEEE_PRIVILEGE_WAREHOUSE_ADMIN = "warehouse_admin";
    public static final String WEEE_PRIVILEGE_WAREHOUSE_VIEWER = "warehouse_viewer";
    public static final String WEEE_PRIVILEGE_PURCHASE_ADMIN = "purchase_admin";
    public static final String WEEE_PRIVILEGE_PURCHASE_VIEWER = "purchase_viewer";
    public static final String WEEE_PRIVILEGE_PURCHASE_VIEWER_READONLY = "purchase_viewer_readonly";
    public static final String WEEE_PRIVILEGE_ARTICLE_ADMIN = "article_admin";
    public static final String WEEE_PRIVILEGE_DEAL_3RD_ADMIN = "deal_3rd_admin";
    public static final String WEEE_PRIVILEGE_DEAL_3RD_VENDOR_VOUCHER = "deal_3rd_vendor_voucher";
    public static final String WEEE_PRIVILEGE_DEAL_ACCOUNTING = "deal_accounting";
    public static final String WEEE_PRIVILEGE_INVOICE_MANAGEMENT = "invoice_management";
    public static final String WEEE_PRIVILEGE_INVOICE_CREATE = "invoice_create";
    public static final String WEEE_PRIVILEGE_POINTS_ADMIN = "points_admin";
    public static final String WEEE_PRIVILEGE_POINTS_CREATE = "points_create";
    public static final String WEEE_PRIVILEGE_POINTS_VIEW = "points_view";
    public static final String WEEE_PRIVILEGE_GB_RETURN_ADMIN = "gb_return_admin";
    public static final String WEEE_PRIVILEGE_GB_RETURN_CREATE = "gb_return_create";
    public static final String WEEE_PRIVILEGE_GB_RETURN_VIEW = "gb_return_view";
    public static final String WEEE_PRIVILEGE_REPORT_VIEW = "report_view";
    public static final String WEEE_PRIVILEGE_CONFIG = "config";
    public static final String WEEE_PRIVILEGE_CS_ADMIN = "customer_service_admin";
    public static final String WEEE_PRIVILEGE_MERCHANDISE_DIRECTOR = "merchandise_director";
    public static final String WEEE_PRIVILEGE_FINANCIAL_DIRECTOR = "financial_director";
    public static final String WEEE_PRIVILEGE_PRODUCT_PRICE_MANAGER = "product_price_admin";

    public static final String WEEE_PRIVILEGE_PRODUCT_VIEW = "product_view";
    public static final String WEEE_PRIVILEGE_PRODUCT_PHOTO_EDIT = "product_photo_edit";
    public static final String WEEE_PRIVILEGE_CANCEL_ORDER = "cancel_order";
    public static final String WEEE_PRIVILEGE_VIEW_ORDER = "view_order";

    public static final String META_CODE_DEAL_ROLE_PACKING_MAN = "P";
    public static final String META_CODE_DEAL_ROLE_BALE_MAN = "B";
    
    public static final String COOKIE_AUTH_TOKEN = "auth_token";
    public static final String COOKIE_EP_PARTNER = "ep_partner";
    public static final String SESSION_REFERRER_ID = "referrer_id";
    
    public static final String META_CODE_USER_CATALOGUE_FAILED_TO_CONVERT = "F";

    public static final Integer INVITE_FRIENDS_COUPON_AMOUNT = 15;
    public static final Integer INVITE_FRIENDS_COUPON_AMOUNT_NEW_INIT = 10;
    public static final Integer INVITE_FRIENDS_COUPON_AMOUNT_NEW = 20;

    public static final String WEEE_DEFAULT_PROMOTION_AREA_CODE = "1";

    public static final Integer EXPERIMENT_TEST_GROUP = 1;
    public static final Integer EXPERIMENT_CONTROL_GROUP = 2;
    public static final String EXPERIMENT_BASE_TYPE_USER = "U";
    public static final String EXPERIMENT_BASE_TYPE_DEVICE = "D";

    public static final Integer EXPERIMENT_ID_EMAIL_SIGN_UP_PHONE = 49;
    public static final Integer EXPERIMENT_ID_ORDER_COUPON_TASK = 52;
    public static final Integer EXPERIMENT_ID_NEW_USER_TASK = 57;
    public static final Integer EXPERIMENT_ID_WELCOME_EMAIL = 61;
    public static final Integer EXPERIMENT_ID_PHONE_SIGN_UP_PHONE = 67;


    public static final String USER_NOTIFICATION_KEY_TRIAL_MEMBER = "free_trial";
    public static final String USER_NOTIFICATION_KEY_BIND_ACCOUNT = "bind_account_notification";

    public static final String USER_ROLE_ANONYMOUS = "_";
    public static final String USER_STATUS_BAN = "X";
    
    public static final String META_CODE_BANNER_USER_TYPE_NEW = "new";
    public static final String META_CODE_BANNER_USER_TYPE_EXISTING = "existing";

    public static final String META_CODE_PUBLISH_TYPE_YES = "Y";
    public static final String META_CODE_PUBLISH_TYPE_NO = "N";
    public static final String META_CODE_PUBLISH_TYPE_DRAFT = "D";
}
