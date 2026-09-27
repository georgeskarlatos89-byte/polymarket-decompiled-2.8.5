package io.intercom.android.sdk.m5;

import android.content.Intent;
import android.os.Bundle;
import defpackage.cgi;
import defpackage.dmk;
import defpackage.g67;
import defpackage.hii;
import defpackage.pq4;
import defpackage.qk4;
import defpackage.sel;
import defpackage.sr8;
import defpackage.vl4;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseComponentActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.home.ui.helpers.InMemoryWebViewCacheKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/IntercomRootActivity;", "Lio/intercom/android/sdk/activities/IntercomBaseComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntercomRootActivity extends IntercomBaseComponentActivity {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ((getResources().getConfiguration().uiMode & 48) == 32) goto L13;
     */
    @Override // io.intercom.android.sdk.activities.IntercomBaseComponentActivity, androidx.fragment.app.t, defpackage.pk4, defpackage.ok4, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle savedInstanceState) {
        hii hiiVar;
        super.onCreate(savedInstanceState);
        int i = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    dmk.a();
                    return;
                }
            }
            hiiVar = new hii(0, 0, 1, new cgi(2));
            g67.a(this, hiiVar, hiiVar);
            qk4.a(this, new vl4(new Function2<pq4, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity$onCreate$1
                public final void invoke(pq4 pq4Var, int i2) {
                    if ((i2 & 3) == 2) {
                        sr8 sr8Var = (sr8) pq4Var;
                        if (sr8Var.F()) {
                            sr8Var.Y();
                            return;
                        }
                    }
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    appConfig.getClass();
                    final IntercomRootActivity intercomRootActivity = IntercomRootActivity.this;
                    ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, sel.d(-1535408283, new Function2<pq4, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity$onCreate$1.1
                        public final void invoke(pq4 pq4Var2, int i3) {
                            if ((i3 & 3) == 2) {
                                sr8 sr8Var2 = (sr8) pq4Var2;
                                if (sr8Var2.F()) {
                                    sr8Var2.Y();
                                    return;
                                }
                            }
                            Intent intent = IntercomRootActivity.this.getIntent();
                            intent.getClass();
                            IntercomRootNavHostKt.IntercomRootNavHost(intent, IntercomRootActivity.this, pq4Var2, 0);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var2, Integer num) {
                            invoke(pq4Var2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, pq4Var), pq4Var, 48);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
                    invoke(pq4Var, num.intValue());
                    return Unit.INSTANCE;
                }
            }, true, 1535831366));
        }
        hiiVar = new hii(0, 0, 2, new cgi(3));
        g67.a(this, hiiVar, hiiVar);
        qk4.a(this, new vl4(new Function2<pq4, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity$onCreate$1
            public final void invoke(pq4 pq4Var, int i2) {
                if ((i2 & 3) == 2) {
                    sr8 sr8Var = (sr8) pq4Var;
                    if (sr8Var.F()) {
                        sr8Var.Y();
                        return;
                    }
                }
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                appConfig.getClass();
                final IntercomRootActivity intercomRootActivity = IntercomRootActivity.this;
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, sel.d(-1535408283, new Function2<pq4, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity$onCreate$1.1
                    public final void invoke(pq4 pq4Var2, int i3) {
                        if ((i3 & 3) == 2) {
                            sr8 sr8Var2 = (sr8) pq4Var2;
                            if (sr8Var2.F()) {
                                sr8Var2.Y();
                                return;
                            }
                        }
                        Intent intent = IntercomRootActivity.this.getIntent();
                        intent.getClass();
                        IntercomRootNavHostKt.IntercomRootNavHost(intent, IntercomRootActivity.this, pq4Var2, 0);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var2, Integer num) {
                        invoke(pq4Var2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, pq4Var), pq4Var, 48);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
                invoke(pq4Var, num.intValue());
                return Unit.INSTANCE;
            }
        }, true, 1535831366));
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseComponentActivity, defpackage.gf0, androidx.fragment.app.t, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InMemoryWebViewCacheKt.clearWebViewCache();
        if (isFinishing()) {
            Injector.get().getDataLayer().clearOpenResponse();
        }
    }
}
