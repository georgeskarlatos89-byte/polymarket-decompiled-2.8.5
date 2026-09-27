package io.intercom.android.sdk.ui.preview.data;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import defpackage.dmk;
import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "Landroid/os/Parcelable;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "getMimeType", "", "context", "Landroid/content/Context;", "isImage", "", "isVideo", "LocalFile", "NetworkFile", "Companion", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$LocalFile;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$NetworkFile;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class IntercomPreviewFile implements Parcelable {
    private final Uri uri;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private IntercomPreviewFile(Uri uri) {
        this.uri = uri;
    }

    public final String getMimeType(Context context) {
        context.getClass();
        if (this instanceof LocalFile) {
            String type = context.getContentResolver().getType(this.uri);
            if (type == null) {
                return "application/*";
            }
            return type;
        }
        if (this instanceof NetworkFile) {
            return ((NetworkFile) this).getMimeType();
        }
        dmk.a();
        return null;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean isImage(Context context) {
        context.getClass();
        return StringsKt.L(getMimeType(context), "image", false);
    }

    public final boolean isVideo(Context context) {
        context.getClass();
        return StringsKt.L(getMimeType(context), "video", false);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\f\u0010\t\u001a\u00020\n*\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$Companion;", "", "<init>", "()V", "fromUrl", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "url", "", "mimeType", "isRemoteUrl", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isRemoteUrl(String str) {
            return Patterns.WEB_URL.matcher(str).matches();
        }

        public final IntercomPreviewFile fromUrl(String url, String mimeType) {
            url.getClass();
            mimeType.getClass();
            if (isRemoteUrl(url)) {
                return new NetworkFile(url, mimeType);
            }
            return new LocalFile(Uri.parse(url));
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$LocalFile;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "fileUri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getFileUri", "()Landroid/net/Uri;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class LocalFile extends IntercomPreviewFile {
        public static final int $stable = 8;
        public static final Parcelable.Creator<LocalFile> CREATOR = new Creator();
        private final Uri fileUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalFile(Uri uri) {
            super(uri, null);
            uri.getClass();
            this.fileUri = uri;
        }

        public static /* synthetic */ LocalFile copy$default(LocalFile localFile, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = localFile.fileUri;
            }
            return localFile.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getFileUri() {
            return this.fileUri;
        }

        public final LocalFile copy(Uri fileUri) {
            fileUri.getClass();
            return new LocalFile(fileUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof LocalFile) && Intrinsics.areEqual(this.fileUri, ((LocalFile) other).fileUri)) {
                return true;
            }
            return false;
        }

        public final Uri getFileUri() {
            return this.fileUri;
        }

        public int hashCode() {
            return this.fileUri.hashCode();
        }

        public String toString() {
            return "LocalFile(fileUri=" + this.fileUri + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeParcelable(this.fileUri, flags);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<LocalFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalFile createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LocalFile((Uri) parcel.readParcelable(LocalFile.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ LocalFile[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalFile[] newArray(int i) {
                return new LocalFile[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ LocalFile createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$NetworkFile;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "url", "", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getMimeType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class NetworkFile extends IntercomPreviewFile {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NetworkFile> CREATOR = new Creator();
        private final String mimeType;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkFile(String str, String str2) {
            super(Uri.parse(str), null);
            str.getClass();
            str2.getClass();
            this.url = str;
            this.mimeType = str2;
        }

        public static /* synthetic */ NetworkFile copy$default(NetworkFile networkFile, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = networkFile.url;
            }
            if ((i & 2) != 0) {
                str2 = networkFile.mimeType;
            }
            return networkFile.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        public final NetworkFile copy(String url, String mimeType) {
            url.getClass();
            mimeType.getClass();
            return new NetworkFile(url, mimeType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkFile)) {
                return false;
            }
            NetworkFile networkFile = (NetworkFile) other;
            if (Intrinsics.areEqual(this.url, networkFile.url) && Intrinsics.areEqual(this.mimeType, networkFile.mimeType)) {
                return true;
            }
            return false;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.mimeType.hashCode() + (this.url.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NetworkFile(url=");
            sb.append(this.url);
            sb.append(", mimeType=");
            return m51.m(sb, this.mimeType, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.url);
            dest.writeString(this.mimeType);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<NetworkFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkFile createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new NetworkFile(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ NetworkFile[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkFile[] newArray(int i) {
                return new NetworkFile[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ NetworkFile createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }
    }

    public /* synthetic */ IntercomPreviewFile(Uri uri, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri);
    }
}
