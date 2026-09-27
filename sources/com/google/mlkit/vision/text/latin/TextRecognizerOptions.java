package com.google.mlkit.vision.text.latin;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
import com.google.mlkit.vision.text.internal.TextRecognizerOptionsUtils;
import defpackage.dkn;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class TextRecognizerOptions implements TextRecognizerOptionsInterface {
    public static final TextRecognizerOptions DEFAULT_OPTIONS = new Builder().build();
    private final Executor zzb;
    final AtomicReference zza = new AtomicReference();
    private final String zzc = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Builder {
        private Executor zza;

        public TextRecognizerOptions build() {
            return new TextRecognizerOptions(this.zza, "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile");
        }

        public Builder setExecutor(Executor executor) {
            this.zza = executor;
            return this;
        }
    }

    public TextRecognizerOptions(Executor executor, String str) {
        this.zzb = executor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextRecognizerOptions)) {
            return false;
        }
        return dkn.b(this.zzb, ((TextRecognizerOptions) obj).zzb);
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final String getConfigLabel() {
        return this.zzc;
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final Executor getExecutor() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final boolean getIsThickClient() {
        return TextRecognizerOptionsUtils.isThickClient(this.zza, "com.google.mlkit.dynamite.text.latin");
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final String getLanguageHint() {
        return "en";
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final int getLoggingEventId() {
        if (getIsThickClient()) {
            return 24317;
        }
        return 24306;
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final int getLoggingLanguageOption() {
        return 1;
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final String getLoggingLibraryName() {
        if (true != getIsThickClient()) {
            return "play-services-mlkit-text-recognition";
        }
        return "text-recognition";
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final String getLoggingLibraryNameForOptionalModule() {
        return "optional-module-text-latin";
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final String getModuleId() {
        if (true != getIsThickClient()) {
            return OptionalModuleUtils.OCR_MODULE_ID;
        }
        return "com.google.mlkit.dynamite.text.latin";
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb});
    }
}
