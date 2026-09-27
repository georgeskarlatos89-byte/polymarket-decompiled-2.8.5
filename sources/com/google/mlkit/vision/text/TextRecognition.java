package com.google.mlkit.vision.text;

import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.text.internal.zzo;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class TextRecognition {
    private TextRecognition() {
    }

    public static TextRecognizer getClient(TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
        return ((zzo) MlKitContext.getInstance().get(zzo.class)).zza(textRecognizerOptionsInterface);
    }
}
