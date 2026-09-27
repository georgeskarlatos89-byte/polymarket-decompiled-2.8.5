package io.intercom.android.sdk.api;

import android.content.Context;
import com.intercom.twig.Twig;
import defpackage.eb4;
import defpackage.jrn;
import defpackage.k84;
import defpackage.kp5;
import defpackage.lvf;
import defpackage.ro5;
import defpackage.tof;
import defpackage.vhn;
import defpackage.vka;
import defpackage.w1f;
import defpackage.wcf;
import defpackage.whn;
import defpackage.ylk;
import io.intercom.android.sdk.logger.LumberMill;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/api/WrapperPrefsStore;", "", "Lkp5;", "Ly1f;", "dataStore", "<init>", "(Lkp5;)V", "", "getCordovaVersion", "()Ljava/lang/String;", "getReactNativeVersion", "version", "", "setCordovaVersion", "(Ljava/lang/String;)V", "setReactNativeVersion", "clear", "()V", "Lkp5;", "cachedCordovaVersion", "Ljava/lang/String;", "cachedReactNativeVersion", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WrapperPrefsStore {
    private static final String OLD_PREFS_NAME = "intercomsdk_wrapper_prefs";
    private static final Twig twig;
    private volatile String cachedCordovaVersion;
    private volatile String cachedReactNativeVersion;
    private final kp5 dataStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final String OLD_CORDOVA_VERSION_KEY = "cordova_version";
    private static final w1f KEY_CORDOVA_VERSION = new w1f(OLD_CORDOVA_VERSION_KEY);
    private static final String OLD_REACT_NATIVE_VERSION_KEY = "react_native_version";
    private static final w1f KEY_REACT_NATIVE_VERSION = new w1f(OLD_REACT_NATIVE_VERSION_KEY);
    private static final tof wrapperPrefsDataStore$delegate = jrn.b("intercom_wrapper_prefs_datastore", null, new ylk(9), 10);

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
    }

    private WrapperPrefsStore(kp5 kp5Var) {
        this.dataStore = kp5Var;
    }

    public static /* synthetic */ List a(Context context) {
        return wrapperPrefsDataStore_delegate$lambda$4(context);
    }

    public static final /* synthetic */ kp5 access$getDataStore$p(WrapperPrefsStore wrapperPrefsStore) {
        return wrapperPrefsStore.dataStore;
    }

    public static final /* synthetic */ w1f access$getKEY_CORDOVA_VERSION$cp() {
        return KEY_CORDOVA_VERSION;
    }

    public static final /* synthetic */ w1f access$getKEY_REACT_NATIVE_VERSION$cp() {
        return KEY_REACT_NATIVE_VERSION;
    }

    public static final /* synthetic */ tof access$getWrapperPrefsDataStore$delegate$cp() {
        return wrapperPrefsDataStore$delegate;
    }

    public static final WrapperPrefsStore create(Context context) {
        return INSTANCE.create(context);
    }

    public static final WrapperPrefsStore createForTesting$intercom_sdk_base_release(kp5 kp5Var) {
        return INSTANCE.createForTesting$intercom_sdk_base_release(kp5Var);
    }

    private static final List wrapperPrefsDataStore_delegate$lambda$4(Context context) {
        context.getClass();
        return eb4.c(INSTANCE.createSharedPrefsMigration$intercom_sdk_base_release(context));
    }

    public final void clear() {
        vhn.e(new WrapperPrefsStore$clear$1(this, null));
        this.cachedCordovaVersion = "";
        this.cachedReactNativeVersion = "";
    }

    public final String getCordovaVersion() {
        String str = this.cachedCordovaVersion;
        if (str != null) {
            return str;
        }
        try {
            Object b = whn.b(g.a, new WrapperPrefsStore$getCordovaVersion$2(this, null));
            this.cachedCordovaVersion = (String) b;
            return (String) b;
        } catch (Exception e) {
            twig.w(k84.e(e, new StringBuilder("Failed to read cordova version from DataStore: ")), new Object[0]);
            return "";
        }
    }

    public final String getReactNativeVersion() {
        String str = this.cachedReactNativeVersion;
        if (str != null) {
            return str;
        }
        try {
            Object b = whn.b(g.a, new WrapperPrefsStore$getReactNativeVersion$2(this, null));
            this.cachedReactNativeVersion = (String) b;
            return (String) b;
        } catch (Exception e) {
            twig.w(k84.e(e, new StringBuilder("Failed to read react native version from DataStore: ")), new Object[0]);
            return "";
        }
    }

    public final void setCordovaVersion(String version) {
        version.getClass();
        vhn.e(new WrapperPrefsStore$setCordovaVersion$1(this, version, null));
        this.cachedCordovaVersion = version;
    }

    public final void setReactNativeVersion(String version) {
        version.getClass();
        vhn.e(new WrapperPrefsStore$setReactNativeVersion$1(this, version, null));
        this.cachedReactNativeVersion = version;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011R%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/api/WrapperPrefsStore$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/intercom/android/sdk/api/WrapperPrefsStore;", "create", "(Landroid/content/Context;)Lio/intercom/android/sdk/api/WrapperPrefsStore;", "Lkp5;", "Ly1f;", "dataStore", "createForTesting$intercom_sdk_base_release", "(Lkp5;)Lio/intercom/android/sdk/api/WrapperPrefsStore;", "createForTesting", "Lro5;", "createSharedPrefsMigration$intercom_sdk_base_release", "(Landroid/content/Context;)Lro5;", "createSharedPrefsMigration", "wrapperPrefsDataStore$delegate", "Ltof;", "getWrapperPrefsDataStore", "(Landroid/content/Context;)Lkp5;", "wrapperPrefsDataStore", "", "OLD_PREFS_NAME", "Ljava/lang/String;", "OLD_CORDOVA_VERSION_KEY", "OLD_REACT_NATIVE_VERSION_KEY", "Lw1f;", "KEY_CORDOVA_VERSION", "Lw1f;", "KEY_REACT_NATIVE_VERSION", "Lcom/intercom/twig/Twig;", "twig", "Lcom/intercom/twig/Twig;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ vka[] $$delegatedProperties = {lvf.a.property2(new wcf(Companion.class, "wrapperPrefsDataStore", "getWrapperPrefsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final kp5 getWrapperPrefsDataStore(Context context) {
            return (kp5) WrapperPrefsStore.access$getWrapperPrefsDataStore$delegate$cp().getValue(context, $$delegatedProperties[0]);
        }

        public final WrapperPrefsStore create(Context context) {
            context.getClass();
            return new WrapperPrefsStore(getWrapperPrefsDataStore(context), null);
        }

        public final WrapperPrefsStore createForTesting$intercom_sdk_base_release(kp5 dataStore) {
            dataStore.getClass();
            return new WrapperPrefsStore(dataStore, null);
        }

        public final ro5 createSharedPrefsMigration$intercom_sdk_base_release(Context context) {
            context.getClass();
            return new WrapperPrefsStore$Companion$createSharedPrefsMigration$1(context);
        }

        private Companion() {
        }
    }

    public /* synthetic */ WrapperPrefsStore(kp5 kp5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(kp5Var);
    }
}
