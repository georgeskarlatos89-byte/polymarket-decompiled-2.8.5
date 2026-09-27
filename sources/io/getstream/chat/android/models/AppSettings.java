package io.getstream.chat.android.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/getstream/chat/android/models/AppSettings;", "", "app", "Lio/getstream/chat/android/models/App;", "<init>", "(Lio/getstream/chat/android/models/App;)V", "getApp", "()Lio/getstream/chat/android/models/App;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AppSettings {
    public static final long DEFAULT_SIZE_LIMIT_IN_BYTES = 104857600;
    private final App app;

    public AppSettings(App app) {
        app.getClass();
        this.app = app;
    }

    public static /* synthetic */ AppSettings copy$default(AppSettings appSettings, App app, int i, Object obj) {
        if ((i & 1) != 0) {
            app = appSettings.app;
        }
        return appSettings.copy(app);
    }

    /* renamed from: component1, reason: from getter */
    public final App getApp() {
        return this.app;
    }

    public final AppSettings copy(App app) {
        app.getClass();
        return new AppSettings(app);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof AppSettings) && Intrinsics.areEqual(this.app, ((AppSettings) other).app)) {
            return true;
        }
        return false;
    }

    public final App getApp() {
        return this.app;
    }

    public int hashCode() {
        return this.app.hashCode();
    }

    public String toString() {
        return "AppSettings(app=" + this.app + ")";
    }
}
