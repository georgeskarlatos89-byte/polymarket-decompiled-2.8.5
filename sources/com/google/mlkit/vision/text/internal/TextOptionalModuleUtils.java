package com.google.mlkit.vision.text.internal;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
import defpackage.gw7;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class TextOptionalModuleUtils {
    private TextOptionalModuleUtils() {
    }

    public static gw7[] zza(TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
        if (textRecognizerOptionsInterface.getIsThickClient()) {
            return OptionalModuleUtils.EMPTY_FEATURES;
        }
        switch (textRecognizerOptionsInterface.getLoggingLanguageOption()) {
            case 2:
                return new gw7[]{OptionalModuleUtils.FEATURE_OCR_CHINESE};
            case 3:
                return new gw7[]{OptionalModuleUtils.FEATURE_OCR_DEVANAGARI};
            case 4:
                return new gw7[]{OptionalModuleUtils.FEATURE_OCR_JAPANESE};
            case 5:
                return new gw7[]{OptionalModuleUtils.FEATURE_OCR_KOREAN};
            case 6:
            case 7:
            case 8:
                return new gw7[]{OptionalModuleUtils.FEATURE_OCR_COMMON};
            default:
                return new gw7[]{OptionalModuleUtils.FEATURE_OCR};
        }
    }
}
