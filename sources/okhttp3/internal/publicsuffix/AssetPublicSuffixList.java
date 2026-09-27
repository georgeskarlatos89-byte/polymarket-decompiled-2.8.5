package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import defpackage.dmk;
import defpackage.meh;
import defpackage.pkn;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.PlatformRegistry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lokhttp3/internal/publicsuffix/AssetPublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "", "path", "<init>", "(Ljava/lang/String;)V", "Lmeh;", "listSource", "()Lmeh;", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AssetPublicSuffixList extends BasePublicSuffixList {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PUBLIC_SUFFIX_RESOURCE = "PublicSuffixDatabase.list";
    private final String path;

    public /* synthetic */ AssetPublicSuffixList(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : str);
    }

    public static final /* synthetic */ String access$getPUBLIC_SUFFIX_RESOURCE$cp() {
        return PUBLIC_SUFFIX_RESOURCE;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public /* bridge */ /* synthetic */ Object getPath() {
        return getPath();
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public meh listSource() {
        AssetManager assetManager;
        Context applicationContext = PlatformRegistry.INSTANCE.getApplicationContext();
        if (applicationContext != null) {
            assetManager = applicationContext.getAssets();
        } else {
            assetManager = null;
        }
        if (assetManager == null) {
            if (Build.FINGERPRINT == null) {
                dmk.x("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
                return null;
            }
            dmk.x("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            return null;
        }
        InputStream open = assetManager.open(getPath());
        open.getClass();
        return pkn.b(open);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/publicsuffix/AssetPublicSuffixList$Companion;", "", "<init>", "()V", "PUBLIC_SUFFIX_RESOURCE", "", "getPUBLIC_SUFFIX_RESOURCE", "()Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getPUBLIC_SUFFIX_RESOURCE() {
            return AssetPublicSuffixList.access$getPUBLIC_SUFFIX_RESOURCE$cp();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public String getPath() {
        return this.path;
    }

    public AssetPublicSuffixList(String str) {
        str.getClass();
        this.path = str;
    }

    public AssetPublicSuffixList() {
        this(null, 1, null);
    }
}
