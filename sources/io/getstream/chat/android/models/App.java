package io.getstream.chat.android.models;

import com.socure.docv.capturesdk.api.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lio/getstream/chat/android/models/App;", "", Keys.KEY_NAME, "", "fileUploadConfig", "Lio/getstream/chat/android/models/FileUploadConfig;", "imageUploadConfig", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/FileUploadConfig;Lio/getstream/chat/android/models/FileUploadConfig;)V", "getName", "()Ljava/lang/String;", "getFileUploadConfig", "()Lio/getstream/chat/android/models/FileUploadConfig;", "getImageUploadConfig", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class App {
    private final FileUploadConfig fileUploadConfig;
    private final FileUploadConfig imageUploadConfig;
    private final String name;

    public App(String str, FileUploadConfig fileUploadConfig, FileUploadConfig fileUploadConfig2) {
        str.getClass();
        fileUploadConfig.getClass();
        fileUploadConfig2.getClass();
        this.name = str;
        this.fileUploadConfig = fileUploadConfig;
        this.imageUploadConfig = fileUploadConfig2;
    }

    public static /* synthetic */ App copy$default(App app, String str, FileUploadConfig fileUploadConfig, FileUploadConfig fileUploadConfig2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = app.name;
        }
        if ((i & 2) != 0) {
            fileUploadConfig = app.fileUploadConfig;
        }
        if ((i & 4) != 0) {
            fileUploadConfig2 = app.imageUploadConfig;
        }
        return app.copy(str, fileUploadConfig, fileUploadConfig2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final FileUploadConfig getFileUploadConfig() {
        return this.fileUploadConfig;
    }

    /* renamed from: component3, reason: from getter */
    public final FileUploadConfig getImageUploadConfig() {
        return this.imageUploadConfig;
    }

    public final App copy(String name, FileUploadConfig fileUploadConfig, FileUploadConfig imageUploadConfig) {
        name.getClass();
        fileUploadConfig.getClass();
        imageUploadConfig.getClass();
        return new App(name, fileUploadConfig, imageUploadConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof App)) {
            return false;
        }
        App app = (App) other;
        if (Intrinsics.areEqual(this.name, app.name) && Intrinsics.areEqual(this.fileUploadConfig, app.fileUploadConfig) && Intrinsics.areEqual(this.imageUploadConfig, app.imageUploadConfig)) {
            return true;
        }
        return false;
    }

    public final FileUploadConfig getFileUploadConfig() {
        return this.fileUploadConfig;
    }

    public final FileUploadConfig getImageUploadConfig() {
        return this.imageUploadConfig;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.imageUploadConfig.hashCode() + ((this.fileUploadConfig.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "App(name=" + this.name + ", fileUploadConfig=" + this.fileUploadConfig + ", imageUploadConfig=" + this.imageUploadConfig + ")";
    }
}
