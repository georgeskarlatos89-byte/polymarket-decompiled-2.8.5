package io.intercom.android.sdk.ui.preview.util;

import android.os.ParcelFileDescriptor;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult;", "", "<init>", "()V", "Success", "PasswordProtected", "Error", "Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult$Error;", "Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult$PasswordProtected;", "Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult$Success;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PdfOpenResult {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult$Error;", "Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Error extends PdfOpenResult {
        public static final int $stable = 8;
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc) {
            super(null);
            exc.getClass();
            this.exception = exc;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        public final Error copy(Exception exception) {
            exception.getClass();
            return new Error(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Error) && Intrinsics.areEqual(this.exception, ((Error) other).exception)) {
                return true;
            }
            return false;
        }

        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.exception + ')';
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult$PasswordProtected;", "Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class PasswordProtected extends PdfOpenResult {
        public static final int $stable = 0;
        public static final PasswordProtected INSTANCE = new PasswordProtected();

        private PasswordProtected() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof PasswordProtected)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 174852190;
        }

        public String toString() {
            return "PasswordProtected";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult$Success;", "Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "tempFile", "Ljava/io/File;", "<init>", "(Landroid/os/ParcelFileDescriptor;Ljava/io/File;)V", "getFileDescriptor", "()Landroid/os/ParcelFileDescriptor;", "getTempFile", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Success extends PdfOpenResult {
        public static final int $stable = 8;
        private final ParcelFileDescriptor fileDescriptor;
        private final File tempFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ParcelFileDescriptor parcelFileDescriptor, File file) {
            super(null);
            parcelFileDescriptor.getClass();
            this.fileDescriptor = parcelFileDescriptor;
            this.tempFile = file;
        }

        public static /* synthetic */ Success copy$default(Success success, ParcelFileDescriptor parcelFileDescriptor, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelFileDescriptor = success.fileDescriptor;
            }
            if ((i & 2) != 0) {
                file = success.tempFile;
            }
            return success.copy(parcelFileDescriptor, file);
        }

        /* renamed from: component1, reason: from getter */
        public final ParcelFileDescriptor getFileDescriptor() {
            return this.fileDescriptor;
        }

        /* renamed from: component2, reason: from getter */
        public final File getTempFile() {
            return this.tempFile;
        }

        public final Success copy(ParcelFileDescriptor fileDescriptor, File tempFile) {
            fileDescriptor.getClass();
            return new Success(fileDescriptor, tempFile);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            if (Intrinsics.areEqual(this.fileDescriptor, success.fileDescriptor) && Intrinsics.areEqual(this.tempFile, success.tempFile)) {
                return true;
            }
            return false;
        }

        public final ParcelFileDescriptor getFileDescriptor() {
            return this.fileDescriptor;
        }

        public final File getTempFile() {
            return this.tempFile;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.fileDescriptor.hashCode() * 31;
            File file = this.tempFile;
            if (file == null) {
                hashCode = 0;
            } else {
                hashCode = file.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Success(fileDescriptor=" + this.fileDescriptor + ", tempFile=" + this.tempFile + ')';
        }
    }

    public /* synthetic */ PdfOpenResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PdfOpenResult() {
    }
}
