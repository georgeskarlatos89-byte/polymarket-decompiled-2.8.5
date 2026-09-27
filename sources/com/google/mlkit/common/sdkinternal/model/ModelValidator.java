package com.google.mlkit.common.sdkinternal.model;

import com.google.mlkit.common.model.RemoteModel;
import java.io.File;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface ModelValidator {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class ValidationResult {
        public static final ValidationResult VALID = new ValidationResult(ErrorCode.OK, null);
        private final ErrorCode zza;
        private final String zzb;

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        /* loaded from: classes3.dex */
        public enum ErrorCode {
            OK,
            TFLITE_VERSION_INCOMPATIBLE,
            MODEL_FORMAT_INVALID
        }

        public ValidationResult(ErrorCode errorCode, String str) {
            this.zza = errorCode;
            this.zzb = str;
        }

        public ErrorCode getErrorCode() {
            return this.zza;
        }

        public String getErrorMessage() {
            return this.zzb;
        }

        public boolean isValid() {
            if (this.zza == ErrorCode.OK) {
                return true;
            }
            return false;
        }
    }

    ValidationResult validateModel(File file, RemoteModel remoteModel);
}
