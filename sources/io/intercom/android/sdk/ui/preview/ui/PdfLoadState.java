package io.intercom.android.sdk.ui.preview.ui;

import android.graphics.Bitmap;
import defpackage.sv6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/ui/preview/ui/PdfLoadState;", "", "<init>", "()V", "Loading", "Success", "Error", "Lio/intercom/android/sdk/ui/preview/ui/PdfLoadState$Error;", "Lio/intercom/android/sdk/ui/preview/ui/PdfLoadState$Loading;", "Lio/intercom/android/sdk/ui/preview/ui/PdfLoadState$Success;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
abstract class PdfLoadState {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/ui/preview/ui/PdfLoadState$Error;", "Lio/intercom/android/sdk/ui/preview/ui/PdfLoadState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Error extends PdfLoadState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Error)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1442009823;
        }

        public String toString() {
            return "Error";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/ui/preview/ui/PdfLoadState$Loading;", "Lio/intercom/android/sdk/ui/preview/ui/PdfLoadState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Loading extends PdfLoadState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Loading)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -976332267;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/ui/preview/ui/PdfLoadState$Success;", "Lio/intercom/android/sdk/ui/preview/ui/PdfLoadState;", "bitmaps", "", "Landroid/graphics/Bitmap;", "<init>", "(Ljava/util/List;)V", "getBitmaps", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Success extends PdfLoadState {
        public static final int $stable = 8;
        private final List<Bitmap> bitmaps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List<Bitmap> list) {
            super(null);
            list.getClass();
            this.bitmaps = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = success.bitmaps;
            }
            return success.copy(list);
        }

        public final List<Bitmap> component1() {
            return this.bitmaps;
        }

        public final Success copy(List<Bitmap> bitmaps) {
            bitmaps.getClass();
            return new Success(bitmaps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Success) && Intrinsics.areEqual(this.bitmaps, ((Success) other).bitmaps)) {
                return true;
            }
            return false;
        }

        public final List<Bitmap> getBitmaps() {
            return this.bitmaps;
        }

        public int hashCode() {
            return this.bitmaps.hashCode();
        }

        public String toString() {
            return sv6.r(new StringBuilder("Success(bitmaps="), this.bitmaps, ')');
        }
    }

    public /* synthetic */ PdfLoadState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PdfLoadState() {
    }
}
