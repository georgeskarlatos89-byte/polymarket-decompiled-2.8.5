package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.api.Platform;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0017\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007\"\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\"\u000e\u0010 \u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010F\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010S\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010T\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010U\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010V\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010W\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010X\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010Y\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010Z\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010[\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\\\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010]\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010^\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010_\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010`\u001a\u00020'X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010a\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010b\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010c\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010d\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010e\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"$\u0010g\u001a\u0012\u0012\u0004\u0012\u00020\u00010hj\b\u0012\u0004\u0012\u00020\u0001`iX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010k\"\u000e\u0010l\u001a\u00020,X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010m\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010o\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006p"}, d2 = {"TAG_PREF", "", "SHOW_DEBUG_SCAN_STAGE", "", "getSHOW_DEBUG_SCAN_STAGE", "()Z", "setSHOW_DEBUG_SCAN_STAGE", "(Z)V", "PRINT_DETAILED_LOG", "getPRINT_DETAILED_LOG", "setPRINT_DETAILED_LOG", "SILENCE_DEBUG_LOG", "getSILENCE_DEBUG_LOG", "setSILENCE_DEBUG_LOG", "PRINT_PII_IN_DEBUG_LOG", "getPRINT_PII_IN_DEBUG_LOG", "setPRINT_PII_IN_DEBUG_LOG", "SOURCE_PLATFORM", "Lcom/socure/docv/capturesdk/api/Platform;", "getSOURCE_PLATFORM", "()Lcom/socure/docv/capturesdk/api/Platform;", "setSOURCE_PLATFORM", "(Lcom/socure/docv/capturesdk/api/Platform;)V", "OPEN_CV_SUPPORTED", "getOPEN_CV_SUPPORTED", "setOPEN_CV_SUPPORTED", "TOTAL_MEMORY", "", "getTOTAL_MEMORY", "()J", "setTOTAL_MEMORY", "(J)V", "UNSET", "", "DEFAULT_BLUR_MODEL_FILE_NAME", "DEFAULT_CORNER_MODEL_FILE_NAME", "DEFAULT_GLARE_MODEL_FILE_NAME", "DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME", "DEFAULT_ORIENTATION_THRESHOLD", "", "DEFAULT_BLUR_THRESHOLD", "DEFAULT_GLARE_THRESHOLD", "DEFAULT_GLARE_INTENSITY_THRESHOLD", "BLUR_MODEL_BUFFER_COUNT", "", "GLARE_INTENSITY_MODEL_BUFFER_COUNT", "CORNER_MODEL_BUFFER_COUNT", "GLARE_MODEL_BUFFER_COUNT", "FRONT_CAMERA", "BACK_CAMERA", "USER_FACING_MODE", "ENV_FACING_MODE", "AUTO_MAX_ERROR", "MANUAL_MAX_ERROR", "MIN_BACK_CAMERA_WIDTH", "MIN_BACK_CAMERA_HEIGHT", "MIN_FRONT_CAMERA_WIDTH", "MIN_FRONT_CAMERA_HEIGHT", "MANUAL_DBG_DIM", "BARCODE_READER_TIMEOUT_MS", "READABLE_DATE_FORMAT", "NO_STRING_EXTRA", "CODE_NOT_AVAILABLE", "MESSAGE_NOT_AVAILABLE", "CORNER_DETECTION", "GLARE", "BLUR", "BRIGHTNESS", ConstantsKt.DENIED, ConstantsKt.EXPLAINED, "NO_NAV_ACTION", "DEBUG_VIEW_PAINT_STROKE_WIDTH", "SELFIE_WIDTH_PERCENTAGE", "SELFIE_AUTO_WIDTH_PERCENTAGE", "SELFIE_GUIDING_BOX_RATIO", "LICENSE_GUIDING_BOX_RATIO", "PASSPORT_GUIDING_BOX_RATIO", "PASSPORT_SIGNATURE_GUIDING_BOX_RATIO", "VERTICAL_LICENSE_GUIDING_BOX_RATIO", "INCREASING_GUIDING_BOX_AREA", "LICENSE_VERTICAL_ROTATION_ANGLE", "HELP_ALREADY_INITIATED", "ACCESSIBILITY_ANNOUNCEMENT_DELAY", "ACCESSIBILITY_CLOSE_CARD_VERTICAL_PERC", "ACCESSIBILITY_CLOSE_CARD_HORIZONTAL_PERC", "DRAW_GRID_DURATION", "HOLD_GRID_DURATION", "CLEAR_GRID_DURATION", "HOLD_CLEAR_DURATION", "SHOW_TICK_DURATION", "DRAW_GRID_UPPER_RANGE", "LINE_1", "LINE_2", "LINE_3", "PREVIEW_DELAY", "PREVIEW_PROGRESS_BACKGROUND_RATIO", "PREVIEW_PROGRESS_BAR_BACKGROUND_RATIO", "PREVIEW_UPLOAD_DELAY", "INITIAL_PROGRESS_DURATION_MS", "PROGRESS_DELAY_DURATION_MS", "DEFAULT_PROGRESS_VALUE", "BARCODE_TYPE", "MRZ_TYPE", "CONSENT_EXP_MSG_SET", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getCONSENT_EXP_MSG_SET", "()Ljava/util/HashSet;", "SCREEN_FLOW_INITIAL_INDEX", "KEY_MODEL", "KEY_LEGACY_UI", "SOCURE_DEFAULT", "capturesdk_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConstantsKt {
    public static final long ACCESSIBILITY_ANNOUNCEMENT_DELAY = 3000;
    public static final double ACCESSIBILITY_CLOSE_CARD_HORIZONTAL_PERC = 0.94d;
    public static final double ACCESSIBILITY_CLOSE_CARD_VERTICAL_PERC = 0.6d;
    public static final int AUTO_MAX_ERROR = 10;
    public static final String BACK_CAMERA = "Back Camera";
    public static final long BARCODE_READER_TIMEOUT_MS = 500;
    public static final String BARCODE_TYPE = "barcode";
    public static final String BLUR = "blur";
    public static final int BLUR_MODEL_BUFFER_COUNT = 1;
    public static final String BRIGHTNESS = "brightness";
    public static final long CLEAR_GRID_DURATION = 300;
    public static final int CODE_NOT_AVAILABLE = -1;
    public static final String CORNER_DETECTION = "corner_detection";
    public static final int CORNER_MODEL_BUFFER_COUNT = 2;
    public static final float DEBUG_VIEW_PAINT_STROKE_WIDTH = 1.0f;
    public static final String DEFAULT_BLUR_MODEL_FILE_NAME = "blur_model.tflite";
    public static final float DEFAULT_BLUR_THRESHOLD = 0.45f;
    public static final String DEFAULT_CORNER_MODEL_FILE_NAME = "idd_model.tflite";
    public static final String DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME = "light_intensity_model.tflite";
    public static final float DEFAULT_GLARE_INTENSITY_THRESHOLD = 0.3f;
    public static final String DEFAULT_GLARE_MODEL_FILE_NAME = "glare_model.tflite";
    public static final float DEFAULT_GLARE_THRESHOLD = 0.65f;
    public static final float DEFAULT_ORIENTATION_THRESHOLD = 0.5f;
    public static final int DEFAULT_PROGRESS_VALUE = 90;
    public static final String DENIED = "DENIED";
    public static final long DRAW_GRID_DURATION = 600;
    public static final float DRAW_GRID_UPPER_RANGE = 122.0f;
    public static final String ENV_FACING_MODE = "environment";
    public static final String EXPLAINED = "EXPLAINED";
    public static final String FRONT_CAMERA = "Front Camera";
    public static final String GLARE = "glare";
    public static final int GLARE_INTENSITY_MODEL_BUFFER_COUNT = 1;
    public static final int GLARE_MODEL_BUFFER_COUNT = 2;
    public static final boolean HELP_ALREADY_INITIATED = true;
    public static final long HOLD_CLEAR_DURATION = 100;
    public static final long HOLD_GRID_DURATION = 300;
    public static final float INCREASING_GUIDING_BOX_AREA = 0.04f;
    public static final long INITIAL_PROGRESS_DURATION_MS = 1800;
    public static final String KEY_LEGACY_UI = "legacyUI";
    public static final String KEY_MODEL = "model";
    public static final String LICENSE_GUIDING_BOX_RATIO = "1.5857";
    public static final float LICENSE_VERTICAL_ROTATION_ANGLE = 90.0f;
    public static final int LINE_1 = 0;
    public static final int LINE_2 = 11;
    public static final int LINE_3 = 22;
    public static final int MANUAL_DBG_DIM = 200;
    public static final int MANUAL_MAX_ERROR = 3;
    public static final String MESSAGE_NOT_AVAILABLE = "message_not_available";
    public static final int MIN_BACK_CAMERA_HEIGHT = 1152;
    public static final int MIN_BACK_CAMERA_WIDTH = 2048;
    public static final int MIN_FRONT_CAMERA_HEIGHT = 720;
    public static final int MIN_FRONT_CAMERA_WIDTH = 1280;
    public static final String MRZ_TYPE = "mrz";
    public static final int NO_NAV_ACTION = 0;
    public static final String NO_STRING_EXTRA = "";
    private static boolean OPEN_CV_SUPPORTED = false;
    public static final String PASSPORT_GUIDING_BOX_RATIO = "1.4204";
    public static final String PASSPORT_SIGNATURE_GUIDING_BOX_RATIO = "0.7200";
    public static final long PREVIEW_DELAY = 1000;
    public static final float PREVIEW_PROGRESS_BACKGROUND_RATIO = 0.8f;
    public static final float PREVIEW_PROGRESS_BAR_BACKGROUND_RATIO = 0.6f;
    public static final long PREVIEW_UPLOAD_DELAY = 30000;
    private static boolean PRINT_DETAILED_LOG = false;
    private static boolean PRINT_PII_IN_DEBUG_LOG = false;
    public static final long PROGRESS_DELAY_DURATION_MS = 300;
    public static final String READABLE_DATE_FORMAT = "yyyy-MM-dd";
    public static final int SCREEN_FLOW_INITIAL_INDEX = 1;
    public static final float SELFIE_AUTO_WIDTH_PERCENTAGE = 1.0f;
    public static final String SELFIE_GUIDING_BOX_RATIO = "0.66";
    public static final float SELFIE_WIDTH_PERCENTAGE = 0.55f;
    private static boolean SHOW_DEBUG_SCAN_STAGE = false;
    public static final long SHOW_TICK_DURATION = 300;
    private static boolean SILENCE_DEBUG_LOG = true;
    public static final String SOCURE_DEFAULT = "socure_default";
    public static final String TAG_PREF = "SDLT_";
    public static final double UNSET = 0.0d;
    public static final String USER_FACING_MODE = "user";
    public static final String VERTICAL_LICENSE_GUIDING_BOX_RATIO = "0.6306";
    private static Platform SOURCE_PLATFORM = Platform.NATIVE;
    private static long TOTAL_MEMORY = -1;
    private static final HashSet<String> CONSENT_EXP_MSG_SET = e.c("Consent ID is invalid", "User consent has expired");

    public static final HashSet<String> getCONSENT_EXP_MSG_SET() {
        return CONSENT_EXP_MSG_SET;
    }

    public static final boolean getOPEN_CV_SUPPORTED() {
        return OPEN_CV_SUPPORTED;
    }

    public static final boolean getPRINT_DETAILED_LOG() {
        return PRINT_DETAILED_LOG;
    }

    public static final boolean getPRINT_PII_IN_DEBUG_LOG() {
        return PRINT_PII_IN_DEBUG_LOG;
    }

    public static final boolean getSHOW_DEBUG_SCAN_STAGE() {
        return SHOW_DEBUG_SCAN_STAGE;
    }

    public static final boolean getSILENCE_DEBUG_LOG() {
        return SILENCE_DEBUG_LOG;
    }

    public static final Platform getSOURCE_PLATFORM() {
        return SOURCE_PLATFORM;
    }

    public static final long getTOTAL_MEMORY() {
        return TOTAL_MEMORY;
    }

    public static final void setOPEN_CV_SUPPORTED(boolean z) {
        OPEN_CV_SUPPORTED = z;
    }

    public static final void setPRINT_DETAILED_LOG(boolean z) {
        PRINT_DETAILED_LOG = z;
    }

    public static final void setPRINT_PII_IN_DEBUG_LOG(boolean z) {
        PRINT_PII_IN_DEBUG_LOG = z;
    }

    public static final void setSHOW_DEBUG_SCAN_STAGE(boolean z) {
        SHOW_DEBUG_SCAN_STAGE = z;
    }

    public static final void setSILENCE_DEBUG_LOG(boolean z) {
        SILENCE_DEBUG_LOG = z;
    }

    public static final void setSOURCE_PLATFORM(Platform platform) {
        platform.getClass();
        SOURCE_PLATFORM = platform;
    }

    public static final void setTOTAL_MEMORY(long j) {
        TOTAL_MEMORY = j;
    }
}
