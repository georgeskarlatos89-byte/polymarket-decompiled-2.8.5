package io.intercom.android.sdk.api;

import android.content.Context;
import com.intercom.twig.Twig;
import defpackage.coc;
import defpackage.eb4;
import defpackage.jrn;
import defpackage.k84;
import defpackage.kp5;
import defpackage.lvf;
import defpackage.ro5;
import defpackage.t85;
import defpackage.tof;
import defpackage.vka;
import defpackage.w1f;
import defpackage.wcf;
import defpackage.whn;
import defpackage.zog;
import io.intercom.android.sdk.logger.LumberMill;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/api/ShutdownStore;", "", "Lkp5;", "Ly1f;", "dataStore", "Lt85;", "scope", "<init>", "(Lkp5;Lt85;)V", "", "default", "getShutdownFingerprint", "(Ljava/lang/String;)Ljava/lang/String;", "", "getShutdownExpiry", "(J)J", "getShutdownReason", "()Ljava/lang/String;", "fingerprint", "expiry", "reason", "", "save", "(Ljava/lang/String;JLjava/lang/String;)V", "clear", "()V", "Lkp5;", "Lt85;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShutdownStore {
    private static final String OLD_EXPIRY_KEY = "ShutdownExpiry";
    private static final String OLD_FINGERPRINT_KEY = "ShutdownFingerprint";
    private static final String OLD_PREFS_NAME = "INTERCOM_SHUTDOWN_PREFS";
    private static final String OLD_REASON_KEY = "ShutdownReason";
    private static final Twig twig;
    private final kp5 dataStore;
    private final t85 scope;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final w1f KEY_SHUTDOWN_FINGERPRINT = new w1f("shutdown_fingerprint");
    private static final w1f KEY_SHUTDOWN_EXPIRY = new w1f("shutdown_expiry");
    private static final w1f KEY_SHUTDOWN_REASON = new w1f("shutdown_reason");
    private static final tof shutdownDataStore$delegate = jrn.b("intercom_shutdown_datastore", null, new zog(29), 10);

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
    }

    private ShutdownStore(kp5 kp5Var, t85 t85Var) {
        this.dataStore = kp5Var;
        this.scope = t85Var;
    }

    public static /* synthetic */ List a(Context context) {
        return shutdownDataStore_delegate$lambda$0(context);
    }

    public static final /* synthetic */ kp5 access$getDataStore$p(ShutdownStore shutdownStore) {
        return shutdownStore.dataStore;
    }

    public static final /* synthetic */ w1f access$getKEY_SHUTDOWN_EXPIRY$cp() {
        return KEY_SHUTDOWN_EXPIRY;
    }

    public static final /* synthetic */ w1f access$getKEY_SHUTDOWN_FINGERPRINT$cp() {
        return KEY_SHUTDOWN_FINGERPRINT;
    }

    public static final /* synthetic */ w1f access$getKEY_SHUTDOWN_REASON$cp() {
        return KEY_SHUTDOWN_REASON;
    }

    public static final /* synthetic */ tof access$getShutdownDataStore$delegate$cp() {
        return shutdownDataStore$delegate;
    }

    public static final ShutdownStore create(Context context, t85 t85Var) {
        return INSTANCE.create(context, t85Var);
    }

    public static final ShutdownStore createForTesting$intercom_sdk_base_release(kp5 kp5Var, t85 t85Var) {
        return INSTANCE.createForTesting$intercom_sdk_base_release(kp5Var, t85Var);
    }

    private static final List shutdownDataStore_delegate$lambda$0(Context context) {
        context.getClass();
        return eb4.c(INSTANCE.createSharedPrefsMigration$intercom_sdk_base_release(context));
    }

    public final void clear() {
        coc.c(this.scope, null, null, new ShutdownStore$clear$1(this, null), 3);
    }

    public final long getShutdownExpiry(long r4) {
        try {
            return ((Number) whn.b(g.a, new ShutdownStore$getShutdownExpiry$1(this, r4, null))).longValue();
        } catch (Exception e) {
            twig.w(k84.e(e, new StringBuilder("Failed to read shutdown expiry from DataStore: ")), new Object[0]);
            return r4;
        }
    }

    public final String getShutdownFingerprint(String r4) {
        r4.getClass();
        try {
            return (String) whn.b(g.a, new ShutdownStore$getShutdownFingerprint$1(this, r4, null));
        } catch (Exception e) {
            twig.w(k84.e(e, new StringBuilder("Failed to read shutdown fingerprint from DataStore: ")), new Object[0]);
            return r4;
        }
    }

    public final String getShutdownReason() {
        try {
            return (String) whn.b(g.a, new ShutdownStore$getShutdownReason$1(this, null));
        } catch (Exception e) {
            twig.w(k84.e(e, new StringBuilder("Failed to read shutdown reason from DataStore: ")), new Object[0]);
            return "";
        }
    }

    public final void save(String fingerprint, long expiry, String reason) {
        fingerprint.getClass();
        reason.getClass();
        coc.c(this.scope, null, null, new ShutdownStore$save$1(this, fingerprint, expiry, reason, null), 3);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013R%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lio/intercom/android/sdk/api/ShutdownStore$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lt85;", "scope", "Lio/intercom/android/sdk/api/ShutdownStore;", "create", "(Landroid/content/Context;Lt85;)Lio/intercom/android/sdk/api/ShutdownStore;", "Lkp5;", "Ly1f;", "dataStore", "createForTesting$intercom_sdk_base_release", "(Lkp5;Lt85;)Lio/intercom/android/sdk/api/ShutdownStore;", "createForTesting", "Lro5;", "createSharedPrefsMigration$intercom_sdk_base_release", "(Landroid/content/Context;)Lro5;", "createSharedPrefsMigration", "shutdownDataStore$delegate", "Ltof;", "getShutdownDataStore", "(Landroid/content/Context;)Lkp5;", "shutdownDataStore", "", "OLD_PREFS_NAME", "Ljava/lang/String;", "OLD_FINGERPRINT_KEY", "OLD_EXPIRY_KEY", "OLD_REASON_KEY", "Lw1f;", "KEY_SHUTDOWN_FINGERPRINT", "Lw1f;", "", "KEY_SHUTDOWN_EXPIRY", "KEY_SHUTDOWN_REASON", "Lcom/intercom/twig/Twig;", "twig", "Lcom/intercom/twig/Twig;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ vka[] $$delegatedProperties = {lvf.a.property2(new wcf(Companion.class, "shutdownDataStore", "getShutdownDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final kp5 getShutdownDataStore(Context context) {
            return (kp5) ShutdownStore.access$getShutdownDataStore$delegate$cp().getValue(context, $$delegatedProperties[0]);
        }

        public final ShutdownStore create(Context context, t85 scope) {
            context.getClass();
            scope.getClass();
            return new ShutdownStore(getShutdownDataStore(context), scope, null);
        }

        public final ShutdownStore createForTesting$intercom_sdk_base_release(kp5 dataStore, t85 scope) {
            dataStore.getClass();
            scope.getClass();
            return new ShutdownStore(dataStore, scope, null);
        }

        public final ro5 createSharedPrefsMigration$intercom_sdk_base_release(Context context) {
            context.getClass();
            return new ShutdownStore$Companion$createSharedPrefsMigration$1(context);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShutdownStore(kp5 kp5Var, t85 t85Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(kp5Var, t85Var);
    }
}
