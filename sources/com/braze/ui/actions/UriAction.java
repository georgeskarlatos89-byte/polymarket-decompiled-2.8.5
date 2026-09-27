package com.braze.ui.actions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.support.UriUtils;
import defpackage.ace;
import defpackage.b69;
import defpackage.bcc;
import defpackage.fx8;
import defpackage.jl1;
import defpackage.k84;
import defpackage.ll1;
import defpackage.m51;
import defpackage.mmj;
import defpackage.pm1;
import defpackage.qi9;
import defpackage.sl1;
import defpackage.tsj;
import defpackage.ue3;
import defpackage.uk1;
import defpackage.wl1;
import defpackage.znj;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0012J)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\u0019\u0010\u0018J7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/braze/ui/actions/UriAction;", "Lcom/braze/ui/actions/IAction;", "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "extras", "", "useWebView", "Lue3;", AppsFlyerProperties.CHANNEL, "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;ZLue3;)V", "Landroid/content/Context;", "context", "", "execute", "(Landroid/content/Context;)V", "openUriWithWebViewActivity", "(Landroid/content/Context;Landroid/net/Uri;Landroid/os/Bundle;)V", "openUriWithActionView", "openUriWithWebViewActivityFromPush", "openUriWithActionViewFromPush", "Landroid/content/Intent;", "getWebViewActivityIntent", "(Landroid/content/Context;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/Intent;", "getActionViewIntent", "targetIntent", "Lsl1;", "configurationProvider", "", "getIntentArrayWithConfiguredBackStack", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;Lsl1;)[Landroid/content/Intent;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Lue3;", "getChannel", "()Lue3;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "Z", "getUseWebView", "()Z", "setUseWebView", "(Z)V", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class UriAction implements IAction {
    private final ue3 channel;
    private final Bundle extras;
    private Uri uri;
    private boolean useWebView;

    public UriAction(Uri uri, Bundle bundle, boolean z, ue3 ue3Var) {
        uri.getClass();
        ue3Var.getClass();
        this.uri = uri;
        this.extras = bundle;
        this.useWebView = z;
        this.channel = ue3Var;
    }

    public static /* synthetic */ String a(String str) {
        return getIntentArrayWithConfiguredBackStack$lambda$1(str);
    }

    public static /* synthetic */ String b(ResolveInfo resolveInfo) {
        return getActionViewIntent$lambda$0(resolveInfo);
    }

    public static /* synthetic */ String c() {
        return getIntentArrayWithConfiguredBackStack$lambda$0();
    }

    public static /* synthetic */ String d(UriAction uriAction) {
        return execute$lambda$2(uriAction);
    }

    public static /* synthetic */ String e(Uri uri) {
        return openUriWithActionViewFromPush$lambda$0(uri);
    }

    private static final String execute$lambda$0(UriAction uriAction) {
        return "Not executing local Uri: " + uriAction.uri;
    }

    private static final String execute$lambda$1(UriAction uriAction) {
        return "Executing BrazeActions uri:\n'" + uriAction.uri + '\'';
    }

    private static final String execute$lambda$2(UriAction uriAction) {
        return "Executing Uri action from channel " + uriAction.channel + ": " + uriAction.uri + ". UseWebView: " + uriAction.useWebView + ". Extras: " + uriAction.extras;
    }

    public static /* synthetic */ String f(UriAction uriAction) {
        return execute$lambda$1(uriAction);
    }

    public static /* synthetic */ String g(Uri uri, Bundle bundle) {
        return openUriWithActionView$lambda$0(uri, bundle);
    }

    private static final String getActionViewIntent$lambda$0(ResolveInfo resolveInfo) {
        return m51.m(new StringBuilder("Setting deep link intent package to "), resolveInfo.activityInfo.packageName, '.');
    }

    private static final String getIntentArrayWithConfiguredBackStack$lambda$0() {
        return "Adding main activity intent to back stack while opening uri from push";
    }

    private static final String getIntentArrayWithConfiguredBackStack$lambda$1(String str) {
        return k84.g("Adding custom back stack activity while opening uri from push: ", str);
    }

    private static final String getIntentArrayWithConfiguredBackStack$lambda$3(String str) {
        return k84.g("Not adding unregistered activity to the back stack while opening uri from push: ", str);
    }

    private static final String getIntentArrayWithConfiguredBackStack$lambda$4() {
        return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
    }

    private static final String getWebViewActivityIntent$lambda$0(String str) {
        return k84.g("Launching custom WebView Activity with class name: ", str);
    }

    public static /* synthetic */ String h(String str) {
        return getIntentArrayWithConfiguredBackStack$lambda$3(str);
    }

    public static /* synthetic */ String i() {
        return openUriWithWebViewActivityFromPush$lambda$0();
    }

    public static /* synthetic */ String j(UriAction uriAction) {
        return execute$lambda$0(uriAction);
    }

    public static /* synthetic */ String k() {
        return openUriWithWebViewActivity$lambda$0();
    }

    public static /* synthetic */ String l() {
        return getIntentArrayWithConfiguredBackStack$lambda$4();
    }

    public static /* synthetic */ String m(String str) {
        return getWebViewActivityIntent$lambda$0(str);
    }

    private static final String openUriWithActionView$lambda$0(Uri uri, Bundle bundle) {
        return "Failed to handle uri " + uri + " with extras: " + bundle;
    }

    private static final String openUriWithActionViewFromPush$lambda$0(Uri uri) {
        return ace.i(uri, "Could not find appropriate activity to open for deep link ");
    }

    private static final String openUriWithWebViewActivity$lambda$0() {
        return "BrazeWebViewActivity not opened successfully.";
    }

    private static final String openUriWithWebViewActivityFromPush$lambda$0() {
        return "Braze WebView Activity not opened successfully.";
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        context.getClass();
        if (wl1.e(this.uri)) {
            final int i = 0;
            b69.h(this, null, null, false, new Function0(this) { // from class: rxj
                public final /* synthetic */ UriAction b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    UriAction uriAction = this.b;
                    switch (i2) {
                        case 0:
                            return UriAction.j(uriAction);
                        case 1:
                            return UriAction.f(uriAction);
                        default:
                            return UriAction.d(uriAction);
                    }
                }
            }, 7);
            return;
        }
        BrazeActionParser brazeActionParser = BrazeActionParser.INSTANCE;
        if (brazeActionParser.isBrazeActionUri(this.uri)) {
            final int i2 = 1;
            b69.h(this, pm1.V, null, false, new Function0(this) { // from class: rxj
                public final /* synthetic */ UriAction b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    UriAction uriAction = this.b;
                    switch (i22) {
                        case 0:
                            return UriAction.j(uriAction);
                        case 1:
                            return UriAction.f(uriAction);
                        default:
                            return UriAction.d(uriAction);
                    }
                }
            }, 6);
            brazeActionParser.execute(context, this.uri, this.channel);
            return;
        }
        final int i3 = 2;
        b69.h(this, null, null, false, new Function0(this) { // from class: rxj
            public final /* synthetic */ UriAction b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UriAction uriAction = this.b;
                switch (i22) {
                    case 0:
                        return UriAction.j(uriAction);
                    case 1:
                        return UriAction.f(uriAction);
                    default:
                        return UriAction.d(uriAction);
                }
            }
        }, 7);
        if (this.useWebView && CollectionsKt.x(wl1.b, this.uri.getScheme())) {
            ue3 ue3Var = this.channel;
            ue3 ue3Var2 = ue3.PUSH;
            Uri uri = this.uri;
            Bundle bundle = this.extras;
            if (ue3Var == ue3Var2) {
                openUriWithWebViewActivityFromPush(context, uri, bundle);
                return;
            } else {
                openUriWithWebViewActivity(context, uri, bundle);
                return;
            }
        }
        ue3 ue3Var3 = this.channel;
        ue3 ue3Var4 = ue3.PUSH;
        Uri uri2 = this.uri;
        Bundle bundle2 = this.extras;
        if (ue3Var3 == ue3Var4) {
            openUriWithActionViewFromPush(context, uri2, bundle2);
        } else {
            openUriWithActionView(context, uri2, bundle2);
        }
    }

    public final Intent getActionViewIntent(Context context, Uri uri, Bundle extras) {
        List<ResolveInfo> queryIntentActivities;
        context.getClass();
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (extras != null) {
            intent.putExtras(extras);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            queryIntentActivities = fx8.z(context.getPackageManager(), intent, fx8.b());
        } else {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        }
        queryIntentActivities.getClass();
        if (queryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (Intrinsics.areEqual(next.activityInfo.packageName, context.getPackageName())) {
                    b69.h(this, null, null, false, new znj(next, 1), 7);
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    public final Intent[] getIntentArrayWithConfiguredBackStack(Context context, Bundle extras, Intent targetIntent, sl1 configurationProvider) {
        context.getClass();
        targetIntent.getClass();
        configurationProvider.getClass();
        Intent intent = null;
        if (configurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            String pushDeepLinkBackStackActivityClassName = configurationProvider.getPushDeepLinkBackStackActivityClassName();
            if (pushDeepLinkBackStackActivityClassName != null && !StringsKt.T(pushDeepLinkBackStackActivityClassName)) {
                if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                    b69.h(this, pm1.I, null, false, new bcc(pushDeepLinkBackStackActivityClassName, 10), 6);
                    if (extras != null) {
                        intent = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(qi9.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(extras);
                    }
                } else {
                    b69.h(this, pm1.I, null, false, new bcc(pushDeepLinkBackStackActivityClassName, 11), 6);
                }
            } else {
                b69.h(this, pm1.I, null, false, new tsj(9), 6);
                intent = UriUtils.getMainActivityIntent(context, extras);
            }
        } else {
            b69.h(this, pm1.I, null, false, new tsj(10), 6);
        }
        if (intent == null) {
            targetIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(qi9.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
            return new Intent[]{targetIntent};
        }
        return new Intent[]{intent, targetIntent};
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final Intent getWebViewActivityIntent(Context context, Uri uri, Bundle extras) {
        sl1 sl1Var;
        Intent intent;
        context.getClass();
        uri.getClass();
        jl1 t = jl1.m.t(context);
        if (t.j != null) {
            sl1Var = t.c();
        } else {
            b69.h(t, null, null, false, new uk1(25), 7);
            sl1Var = new sl1(context);
        }
        String customHtmlWebViewActivityClassName = sl1Var.getCustomHtmlWebViewActivityClassName();
        if (customHtmlWebViewActivityClassName != null && !StringsKt.T(customHtmlWebViewActivityClassName) && UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            b69.h(this, null, null, false, new bcc(customHtmlWebViewActivityClassName, 12), 7);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            intent.getClass();
        } else {
            intent = new Intent(context, (Class<?>) BrazeWebViewActivity.class);
        }
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    public void openUriWithActionView(Context context, Uri uri, Bundle extras) {
        context.getClass();
        uri.getClass();
        Intent actionViewIntent = getActionViewIntent(context, uri, extras);
        actionViewIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(qi9.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(actionViewIntent);
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new mmj(13, uri, extras), 4);
        }
    }

    public void openUriWithActionViewFromPush(Context context, Uri uri, Bundle extras) {
        sl1 sl1Var;
        context.getClass();
        uri.getClass();
        jl1 t = jl1.m.t(context);
        if (t.j != null) {
            sl1Var = t.c();
        } else {
            b69.h(t, null, null, false, new uk1(25), 7);
            sl1Var = new sl1(context);
        }
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getActionViewIntent(context, uri, extras), sl1Var));
        } catch (ActivityNotFoundException e) {
            b69.h(this, pm1.W, e, false, new ll1(uri, 15), 4);
        }
    }

    public void openUriWithWebViewActivity(Context context, Uri uri, Bundle extras) {
        context.getClass();
        uri.getClass();
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, extras);
        webViewActivityIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(qi9.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(webViewActivityIntent);
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new tsj(11), 4);
        }
    }

    public void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle extras) {
        sl1 sl1Var;
        context.getClass();
        uri.getClass();
        jl1 t = jl1.m.t(context);
        if (t.j != null) {
            sl1Var = t.c();
        } else {
            b69.h(t, null, null, false, new uk1(25), 7);
            sl1Var = new sl1(context);
        }
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getWebViewActivityIntent(context, uri, extras), sl1Var));
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new tsj(12), 4);
        }
    }
}
