package io.intercom.android.sdk.helpcenter.articles;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.mlkit.common.MlKitException;
import defpackage.a4n;
import defpackage.c7n;
import defpackage.d1c;
import defpackage.dpc;
import defpackage.evf;
import defpackage.fkl;
import defpackage.frm;
import defpackage.g67;
import defpackage.gdn;
import defpackage.hdi;
import defpackage.hjc;
import defpackage.hrl;
import defpackage.hvd;
import defpackage.iqd;
import defpackage.ix2;
import defpackage.jc4;
import defpackage.kc4;
import defpackage.kjc;
import defpackage.ndj;
import defpackage.nk0;
import defpackage.nym;
import defpackage.oa7;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.pqn;
import defpackage.qk4;
import defpackage.qyn;
import defpackage.rp4;
import defpackage.sel;
import defpackage.sje;
import defpackage.sp4;
import defpackage.sr8;
import defpackage.sv6;
import defpackage.t1k;
import defpackage.vl4;
import defpackage.xlk;
import defpackage.xym;
import defpackage.yr4;
import defpackage.zzm;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.articles.ArticleWebViewClient;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewModel;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.IntercomTopBarIcon;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0015¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity;", "Lio/intercom/android/sdk/helpcenter/IntercomHelpCenterBaseActivity;", "<init>", "()V", "", "setCookies", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$ArticleActivityArguments;", "arguments$delegate", "Lkotlin/Lazy;", "getArguments", "()Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$ArticleActivityArguments;", "arguments", "Ldpc;", "scrollBy", "Ldpc;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "viewModel$delegate", "getViewModel", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "viewModel", "Companion", "ArticleActivityArguments", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntercomArticleActivity extends IntercomHelpCenterBaseActivity {
    private static final String ARTICLE_ID = "ARTICLE_ID";
    private static final String IS_SEARCH_BROWSE = "IS_FROM_SEARCH_BROWSE";
    private static final String METRIC_PLACE = "METRIC_PLACE";
    private static final String SHOULD_HIDE_REACTIONS = "SHOULD_HIDE_REACTIONS";

    /* renamed from: arguments$delegate, reason: from kotlin metadata */
    private final Lazy arguments;
    private final dpc scrollBy = new hvd(0);

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public IntercomArticleActivity() {
        final int i = 0;
        this.arguments = LazyKt.lazy(new Function0(this) { // from class: o4a
            public final /* synthetic */ IntercomArticleActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IntercomArticleActivity intercomArticleActivity = this.b;
                switch (i2) {
                    case 0:
                        return IntercomArticleActivity.i(intercomArticleActivity);
                    default:
                        return IntercomArticleActivity.j(intercomArticleActivity);
                }
            }
        });
        final int i2 = 1;
        this.viewModel = LazyKt.lazy(new Function0(this) { // from class: o4a
            public final /* synthetic */ IntercomArticleActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IntercomArticleActivity intercomArticleActivity = this.b;
                switch (i22) {
                    case 0:
                        return IntercomArticleActivity.i(intercomArticleActivity);
                    default:
                        return IntercomArticleActivity.j(intercomArticleActivity);
                }
            }
        });
    }

    public static final /* synthetic */ ArticleActivityArguments access$getArguments(IntercomArticleActivity intercomArticleActivity) {
        return intercomArticleActivity.getArguments();
    }

    public static final /* synthetic */ ArticleViewModel access$getViewModel(IntercomArticleActivity intercomArticleActivity) {
        return intercomArticleActivity.getViewModel();
    }

    public static final /* synthetic */ void access$setCookies(IntercomArticleActivity intercomArticleActivity) {
        intercomArticleActivity.setCookies();
    }

    private static final ArticleActivityArguments arguments_delegate$lambda$0(IntercomArticleActivity intercomArticleActivity) {
        Companion companion = INSTANCE;
        Intent intent = intercomArticleActivity.getIntent();
        intent.getClass();
        return companion.getArguments(intent);
    }

    public static final Intent buildIntent(Context context, ArticleActivityArguments articleActivityArguments) {
        return INSTANCE.buildIntent(context, articleActivityArguments);
    }

    private final ArticleActivityArguments getArguments() {
        return (ArticleActivityArguments) this.arguments.getValue();
    }

    private final ArticleViewModel getViewModel() {
        return (ArticleViewModel) this.viewModel.getValue();
    }

    public static /* synthetic */ Unit h(IntercomArticleActivity intercomArticleActivity, int i) {
        return viewModel_delegate$lambda$2$lambda$1(intercomArticleActivity, i);
    }

    public static /* synthetic */ ArticleActivityArguments i(IntercomArticleActivity intercomArticleActivity) {
        return arguments_delegate$lambda$0(intercomArticleActivity);
    }

    public static /* synthetic */ ArticleViewModel j(IntercomArticleActivity intercomArticleActivity) {
        return viewModel_delegate$lambda$2(intercomArticleActivity);
    }

    private final void setCookies() {
        Injector injector = Injector.get();
        String str = "intercom-session-" + injector.getAppIdentity().appId();
        String encryptedUserId = injector.getUserIdentity().getEncryptedUserId();
        encryptedUserId.getClass();
        CookieManager.getInstance().setCookie(injector.getAppConfigProvider().get().getHelpCenterUrl(), str + '=' + encryptedUserId);
    }

    private static final ArticleViewModel viewModel_delegate$lambda$2(IntercomArticleActivity intercomArticleActivity) {
        boolean z;
        if ((intercomArticleActivity.getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        ArticleViewModel.Companion companion = ArticleViewModel.INSTANCE;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        helpCenterApi.getClass();
        return companion.create(intercomArticleActivity, helpCenterApi, ((AppConfig) ix2.h()).getHelpCenterUrl(), intercomArticleActivity.getArguments().getMetricPlace(), intercomArticleActivity.getArguments().isFromSearchBrowse(), intercomArticleActivity.getArguments().getShouldHideReactions(), new oa7(intercomArticleActivity, 22), z2);
    }

    private static final Unit viewModel_delegate$lambda$2$lambda$1(IntercomArticleActivity intercomArticleActivity, int i) {
        ((hvd) intercomArticleActivity.scrollBy).z(i);
        return Unit.INSTANCE;
    }

    @Override // io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity, androidx.fragment.app.t, defpackage.pk4, defpackage.ok4, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        g67.b(this);
        super.onCreate(savedInstanceState);
        qk4.a(this, new vl4(new Function2<pq4, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1
            public final void invoke(pq4 pq4Var, int i) {
                if ((i & 3) == 2) {
                    sr8 sr8Var = (sr8) pq4Var;
                    if (sr8Var.F()) {
                        sr8Var.Y();
                        return;
                    }
                }
                final IntercomArticleActivity intercomArticleActivity = IntercomArticleActivity.this;
                IntercomThemeKt.IntercomTheme(null, null, null, sel.d(-199442729, new Function2<pq4, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1.1
                    public final void invoke(pq4 pq4Var2, int i2) {
                        ndj ndjVar;
                        if ((i2 & 3) == 2) {
                            sr8 sr8Var2 = (sr8) pq4Var2;
                            if (sr8Var2.F()) {
                                sr8Var2.Y();
                                return;
                            }
                        }
                        Window window = IntercomArticleActivity.this.getWindow();
                        evf evfVar = new evf(IntercomArticleActivity.this.getWindow().getDecorView());
                        if (Build.VERSION.SDK_INT >= 35) {
                            ndjVar = new ndj(window, evfVar);
                        } else {
                            ndjVar = new ndj(window, evfVar);
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i3 = IntercomTheme.$stable;
                        ndjVar.j(ColorExtensionsKt.m823isLightColor8_81llA(intercomTheme.getColors(pq4Var2, i3).getBase().m701getBase0d7_KjU()));
                        Unit unit = Unit.INSTANCE;
                        sr8 sr8Var3 = (sr8) pq4Var2;
                        sr8Var3.e0(1553126697);
                        boolean j = sr8Var3.j(IntercomArticleActivity.this);
                        IntercomArticleActivity intercomArticleActivity2 = IntercomArticleActivity.this;
                        Object Q = sr8Var3.Q();
                        if (j || Q == oq4.a) {
                            Q = new IntercomArticleActivity$onCreate$1$1$1$1(intercomArticleActivity2, null);
                            sr8Var3.o0(Q);
                        }
                        sr8Var3.s(false);
                        hrl.d(sr8Var3, unit, (Function2) Q);
                        kjc b = t1k.b(hjc.a, sv6.C(intercomTheme, sr8Var3, i3), nym.a);
                        WeakHashMap weakHashMap = xlk.x;
                        qyn.a(a4n.e(b, c7n.b(sr8Var3).b), sel.d(547021723, new AnonymousClass2(IntercomArticleActivity.this), sr8Var3), null, null, null, 0, 0L, 0L, null, sel.d(-494666138, new AnonymousClass3(IntercomArticleActivity.this), sr8Var3), sr8Var3, 805306416, 508);
                    }

                    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$2, reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2 implements Function2<pq4, Integer, Unit> {
                        final /* synthetic */ IntercomArticleActivity this$0;

                        public AnonymousClass2(IntercomArticleActivity intercomArticleActivity) {
                            this.this$0 = intercomArticleActivity;
                        }

                        public static /* synthetic */ Unit a(IntercomArticleActivity intercomArticleActivity) {
                            return invoke$lambda$1$lambda$0(intercomArticleActivity);
                        }

                        private static final Unit invoke$lambda$1$lambda$0(IntercomArticleActivity intercomArticleActivity) {
                            intercomArticleActivity.finish();
                            return Unit.INSTANCE;
                        }

                        public final void invoke(pq4 pq4Var, int i) {
                            if ((i & 3) == 2) {
                                sr8 sr8Var = (sr8) pq4Var;
                                if (sr8Var.F()) {
                                    sr8Var.Y();
                                    return;
                                }
                            }
                            int i2 = R.drawable.intercom_ic_close;
                            sr8 sr8Var2 = (sr8) pq4Var;
                            sr8Var2.e0(344428451);
                            boolean j = sr8Var2.j(this.this$0);
                            IntercomArticleActivity intercomArticleActivity = this.this$0;
                            Object Q = sr8Var2.Q();
                            if (j || Q == oq4.a) {
                                Q = new b(intercomArticleActivity, 0);
                                sr8Var2.o0(Q);
                            }
                            sr8Var2.s(false);
                            IntercomTopBarIcon intercomTopBarIcon = new IntercomTopBarIcon(i2, null, (Function0) Q);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i3 = IntercomTheme.$stable;
                            IntercomTopBarKt.m570IntercomTopBarbogVsAg(null, null, intercomTopBarIcon, null, sv6.C(intercomTheme, sr8Var2, i3), sv6.D(intercomTheme, sr8Var2, i3), null, null, sr8Var2, IntercomTopBarIcon.$stable << 6, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
                            invoke(pq4Var, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var2, Integer num) {
                        invoke(pq4Var2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$3, reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass3 implements Function3<iqd, pq4, Integer, Unit> {
                        final /* synthetic */ IntercomArticleActivity this$0;

                        public AnonymousClass3(IntercomArticleActivity intercomArticleActivity) {
                            this.this$0 = intercomArticleActivity;
                        }

                        public static /* synthetic */ Unit a(WebView webView) {
                            return invoke$lambda$11$lambda$4$lambda$3(webView);
                        }

                        public static /* synthetic */ Unit b(IntercomArticleActivity intercomArticleActivity) {
                            return invoke$lambda$11$lambda$8$lambda$7(intercomArticleActivity);
                        }

                        public static /* synthetic */ Unit c(IntercomArticleActivity intercomArticleActivity) {
                            return invoke$lambda$11$lambda$10$lambda$9(intercomArticleActivity);
                        }

                        public static /* synthetic */ WebView d(IntercomArticleActivity intercomArticleActivity, String str, Map map, Context context) {
                            return invoke$lambda$11$lambda$2$lambda$1(intercomArticleActivity, str, map, context);
                        }

                        public static /* synthetic */ Unit e(IntercomArticleActivity intercomArticleActivity) {
                            return invoke$lambda$13$lambda$12(intercomArticleActivity);
                        }

                        public static /* synthetic */ Unit f(IntercomArticleActivity intercomArticleActivity) {
                            return invoke$lambda$11$lambda$6$lambda$5(intercomArticleActivity);
                        }

                        private static final Unit invoke$lambda$11$lambda$10$lambda$9(IntercomArticleActivity intercomArticleActivity) {
                            IntercomArticleActivity.access$getViewModel(intercomArticleActivity).happyReactionTapped();
                            return Unit.INSTANCE;
                        }

                        private static final WebView invoke$lambda$11$lambda$2$lambda$1(IntercomArticleActivity intercomArticleActivity, String str, Map map, Context context) {
                            WebView webView;
                            context.getClass();
                            try {
                                webView = new WebView(context);
                            } catch (Resources.NotFoundException unused) {
                                webView = new WebView(intercomArticleActivity.getApplicationContext());
                            }
                            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            webView.getSettings().setJavaScriptEnabled(true);
                            webView.getSettings().setDomStorageEnabled(true);
                            webView.getSettings().setMediaPlaybackRequiresUserGesture(true);
                            webView.getSettings().setMixedContentMode(2);
                            webView.getSettings().setAllowFileAccess(false);
                            webView.getSettings().setAllowContentAccess(false);
                            webView.getSettings().setGeolocationEnabled(false);
                            webView.setWebChromeClient(new WebChromeClient());
                            webView.setWebViewClient(new ArticleWebViewClient(str, new IntercomArticleActivity$onCreate$1$1$3$1$1$1$1$1(intercomArticleActivity, webView)));
                            IntercomArticleActivity.access$setCookies(intercomArticleActivity);
                            webView.loadUrl(str, map);
                            return webView;
                        }

                        private static final Unit invoke$lambda$11$lambda$4$lambda$3(WebView webView) {
                            webView.getClass();
                            return Unit.INSTANCE;
                        }

                        private static final Unit invoke$lambda$11$lambda$6$lambda$5(IntercomArticleActivity intercomArticleActivity) {
                            IntercomArticleActivity.access$getViewModel(intercomArticleActivity).sadReactionTapped();
                            return Unit.INSTANCE;
                        }

                        private static final Unit invoke$lambda$11$lambda$8$lambda$7(IntercomArticleActivity intercomArticleActivity) {
                            IntercomArticleActivity.access$getViewModel(intercomArticleActivity).neutralReactionTapped();
                            return Unit.INSTANCE;
                        }

                        private static final Unit invoke$lambda$13$lambda$12(IntercomArticleActivity intercomArticleActivity) {
                            IntercomArticleActivity.access$getViewModel(intercomArticleActivity).fragmentLoaded(IntercomArticleActivity.access$getArguments(intercomArticleActivity).getArticleId());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(iqd iqdVar, pq4 pq4Var, int i) {
                            int i2;
                            ErrorState withoutCTA;
                            boolean z;
                            int i3;
                            iqdVar.getClass();
                            if ((i & 6) == 0) {
                                if (((sr8) pq4Var).h(iqdVar)) {
                                    i3 = 4;
                                } else {
                                    i3 = 2;
                                }
                                i2 = i | i3;
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18) {
                                sr8 sr8Var = (sr8) pq4Var;
                                if (sr8Var.F()) {
                                    sr8Var.Y();
                                    return;
                                }
                            }
                            ArticleViewState articleViewState = (ArticleViewState) fkl.b(IntercomArticleActivity.access$getViewModel(this.this$0).getState(), pq4Var, 0).getValue();
                            boolean z2 = articleViewState instanceof ArticleViewState.Initial;
                            hjc hjcVar = hjc.a;
                            if (z2) {
                                sr8 sr8Var2 = (sr8) pq4Var;
                                sr8Var2.e0(2087909018);
                                LoadingScreenKt.LoadingScreen(frm.e(hjcVar, iqdVar), io.intercom.android.sdk.R.drawable.intercom_article_webview_loading_state, sr8Var2, 0, 0);
                                sr8Var2.s(false);
                                return;
                            }
                            boolean z3 = articleViewState instanceof ArticleViewState.Content;
                            Object obj = oq4.a;
                            boolean z4 = true;
                            if (z3) {
                                sr8 sr8Var3 = (sr8) pq4Var;
                                sr8Var3.e0(2088448015);
                                kjc b = t1k.b(xym.n(frm.e(hjcVar, iqdVar), xym.l(0, sr8Var3, 1), false, 14).e(androidx.compose.foundation.layout.b.c), sv6.C(IntercomTheme.INSTANCE, sr8Var3, IntercomTheme.$stable), nym.a);
                                final IntercomArticleActivity intercomArticleActivity = this.this$0;
                                kc4 a = jc4.a(nk0.c, gdn.o, sr8Var3, 0);
                                int hashCode = Long.hashCode(sr8Var3.T);
                                sje n = sr8Var3.n();
                                kjc e = pqn.e(sr8Var3, b);
                                sp4.h0.getClass();
                                yr4 yr4Var = rp4.b;
                                sr8Var3.i0();
                                if (sr8Var3.S) {
                                    sr8Var3.m(yr4Var);
                                } else {
                                    sr8Var3.r0();
                                }
                                zzm.d(sr8Var3, a, rp4.f);
                                zzm.d(sr8Var3, n, rp4.e);
                                zzm.a(sr8Var3, Integer.valueOf(hashCode), rp4.g);
                                zzm.b(sr8Var3, rp4.h);
                                zzm.d(sr8Var3, e, rp4.d);
                                ArticleViewState.Content content = (ArticleViewState.Content) articleViewState;
                                final String articleUrl = content.getArticleUrl();
                                final Map e2 = d1c.e(new Pair("MobileClientDisplayType", "AndroidIntercomHeaderless"), new Pair("MobileClient", "AndroidIntercomWebView"), new Pair("MobileClientReactionsHidden", "true"));
                                sr8Var3.e0(-286526353);
                                boolean j = sr8Var3.j(intercomArticleActivity) | sr8Var3.h(articleUrl);
                                Object Q = sr8Var3.Q();
                                if (j || Q == obj) {
                                    Q = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0123: CONSTRUCTOR (r7v8 'Q' java.lang.Object) = 
                                          (r0v4 'intercomArticleActivity' io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity A[DONT_INLINE])
                                          (r1v9 'articleUrl' java.lang.String A[DONT_INLINE])
                                          (r2v15 'e2' java.util.Map A[DONT_INLINE])
                                         A[MD:(io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity, java.lang.String, java.util.Map):void (m)] (LINE:292) call: io.intercom.android.sdk.helpcenter.articles.c.<init>(io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity, java.lang.String, java.util.Map):void type: CONSTRUCTOR in method: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity.onCreate.1.1.3.invoke(iqd, pq4, int):void, file: classes6.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.intercom.android.sdk.helpcenter.articles.c, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 33 more
                                        */
                                    /*
                                        Method dump skipped, instructions count: 617
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1.AnonymousClass1.AnonymousClass3.invoke(iqd, pq4, int):void");
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(iqd iqdVar, pq4 pq4Var, Integer num) {
                                    invoke(iqdVar, pq4Var, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }
                        }, pq4Var), pq4Var, 3072, 7);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
                        invoke(pq4Var, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, true, 1674700077));
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$Companion;", "", "<init>", "()V", IntercomArticleActivity.ARTICLE_ID, "", IntercomArticleActivity.METRIC_PLACE, "IS_SEARCH_BROWSE", IntercomArticleActivity.SHOULD_HIDE_REACTIONS, "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "articleActivityArguments", "Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$ArticleActivityArguments;", "getArguments", "intent", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Intent buildIntent(Context context, ArticleActivityArguments articleActivityArguments) {
                    context.getClass();
                    articleActivityArguments.getClass();
                    Intent intent = new Intent(context, (Class<?>) IntercomArticleActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra(IntercomArticleActivity.ARTICLE_ID, articleActivityArguments.getArticleId());
                    intent.putExtra(IntercomArticleActivity.METRIC_PLACE, articleActivityArguments.getMetricPlace());
                    intent.putExtra(IntercomArticleActivity.IS_SEARCH_BROWSE, articleActivityArguments.isFromSearchBrowse());
                    intent.putExtra(IntercomArticleActivity.SHOULD_HIDE_REACTIONS, articleActivityArguments.getShouldHideReactions());
                    return intent;
                }

                public final ArticleActivityArguments getArguments(Intent intent) {
                    intent.getClass();
                    String stringExtra = intent.getStringExtra(IntercomArticleActivity.ARTICLE_ID);
                    String str = "";
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    String stringExtra2 = intent.getStringExtra(IntercomArticleActivity.METRIC_PLACE);
                    if (stringExtra2 != null) {
                        str = stringExtra2;
                    }
                    return new ArticleActivityArguments(stringExtra, str, intent.getBooleanExtra(IntercomArticleActivity.IS_SEARCH_BROWSE, false), intent.getBooleanExtra(IntercomArticleActivity.SHOULD_HIDE_REACTIONS, false));
                }

                private Companion() {
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$ArticleActivityArguments;", "", "articleId", "", "metricPlace", "isFromSearchBrowse", "", "shouldHideReactions", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getArticleId", "()Ljava/lang/String;", "getMetricPlace", "()Z", "getShouldHideReactions", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final /* data */ class ArticleActivityArguments {
                public static final int $stable = 0;
                private final String articleId;
                private final boolean isFromSearchBrowse;
                private final String metricPlace;
                private final boolean shouldHideReactions;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public ArticleActivityArguments(String str, String str2) {
                    this(str, str2, false, false, 12, null);
                    str.getClass();
                    str2.getClass();
                }

                public static /* synthetic */ ArticleActivityArguments copy$default(ArticleActivityArguments articleActivityArguments, String str, String str2, boolean z, boolean z2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = articleActivityArguments.articleId;
                    }
                    if ((i & 2) != 0) {
                        str2 = articleActivityArguments.metricPlace;
                    }
                    if ((i & 4) != 0) {
                        z = articleActivityArguments.isFromSearchBrowse;
                    }
                    if ((i & 8) != 0) {
                        z2 = articleActivityArguments.shouldHideReactions;
                    }
                    return articleActivityArguments.copy(str, str2, z, z2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getArticleId() {
                    return this.articleId;
                }

                /* renamed from: component2, reason: from getter */
                public final String getMetricPlace() {
                    return this.metricPlace;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getIsFromSearchBrowse() {
                    return this.isFromSearchBrowse;
                }

                /* renamed from: component4, reason: from getter */
                public final boolean getShouldHideReactions() {
                    return this.shouldHideReactions;
                }

                public final ArticleActivityArguments copy(String articleId, String metricPlace, boolean isFromSearchBrowse, boolean shouldHideReactions) {
                    articleId.getClass();
                    metricPlace.getClass();
                    return new ArticleActivityArguments(articleId, metricPlace, isFromSearchBrowse, shouldHideReactions);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ArticleActivityArguments)) {
                        return false;
                    }
                    ArticleActivityArguments articleActivityArguments = (ArticleActivityArguments) other;
                    if (Intrinsics.areEqual(this.articleId, articleActivityArguments.articleId) && Intrinsics.areEqual(this.metricPlace, articleActivityArguments.metricPlace) && this.isFromSearchBrowse == articleActivityArguments.isFromSearchBrowse && this.shouldHideReactions == articleActivityArguments.shouldHideReactions) {
                        return true;
                    }
                    return false;
                }

                public final String getArticleId() {
                    return this.articleId;
                }

                public final String getMetricPlace() {
                    return this.metricPlace;
                }

                public final boolean getShouldHideReactions() {
                    return this.shouldHideReactions;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.shouldHideReactions) + hdi.g(hdi.e(this.articleId.hashCode() * 31, 31, this.metricPlace), 31, this.isFromSearchBrowse);
                }

                public final boolean isFromSearchBrowse() {
                    return this.isFromSearchBrowse;
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("ArticleActivityArguments(articleId=");
                    sb.append(this.articleId);
                    sb.append(", metricPlace=");
                    sb.append(this.metricPlace);
                    sb.append(", isFromSearchBrowse=");
                    sb.append(this.isFromSearchBrowse);
                    sb.append(", shouldHideReactions=");
                    return hdi.t(sb, this.shouldHideReactions, ')');
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public ArticleActivityArguments(String str, String str2, boolean z) {
                    this(str, str2, z, false, 8, null);
                    str.getClass();
                    str2.getClass();
                }

                public ArticleActivityArguments(String str, String str2, boolean z, boolean z2) {
                    str.getClass();
                    str2.getClass();
                    this.articleId = str;
                    this.metricPlace = str2;
                    this.isFromSearchBrowse = z;
                    this.shouldHideReactions = z2;
                }

                public /* synthetic */ ArticleActivityArguments(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
                }
            }
        }
