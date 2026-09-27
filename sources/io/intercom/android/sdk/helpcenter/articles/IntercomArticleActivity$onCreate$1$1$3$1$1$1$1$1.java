package io.intercom.android.sdk.helpcenter.articles;

import android.webkit.WebView;
import defpackage.be9;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"io/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$onCreate$1$1$3$1$1$1$1$1", "Lio/intercom/android/sdk/articles/ArticleWebViewListener;", "onArticleStartedLoading", "", "onArticleFinishedLoading", "onArticleLoadingError", "articleNotFound", "scrollArticleViewTo", "y", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntercomArticleActivity$onCreate$1$1$3$1$1$1$1$1 implements ArticleWebViewListener {
    final /* synthetic */ WebView $this_apply;
    final /* synthetic */ IntercomArticleActivity this$0;

    public IntercomArticleActivity$onCreate$1$1$3$1$1$1$1$1(IntercomArticleActivity intercomArticleActivity, WebView webView) {
        this.this$0 = intercomArticleActivity;
        this.$this_apply = webView;
    }

    public static /* synthetic */ void a(IntercomArticleActivity intercomArticleActivity, String str) {
        onArticleFinishedLoading$lambda$0(intercomArticleActivity, str);
    }

    private static final void onArticleFinishedLoading$lambda$0(IntercomArticleActivity intercomArticleActivity, String str) {
        ArticleViewModel access$getViewModel = IntercomArticleActivity.access$getViewModel(intercomArticleActivity);
        str.getClass();
        access$getViewModel.articleContentIdFetched(StringsKt.a0(str));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void articleNotFound() {
        IntercomArticleActivity.access$getViewModel(this.this$0).articleNotFound();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleFinishedLoading() {
        IntercomArticleActivity.access$getViewModel(this.this$0).onArticleFinishedLoading();
        this.$this_apply.evaluateJavascript("window.alexandriaArticleContentId", new be9(this.this$0, 1));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleLoadingError() {
        IntercomArticleActivity.access$getViewModel(this.this$0).onArticleLoadingError();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleStartedLoading() {
        IntercomArticleActivity.access$getViewModel(this.this$0).onArticleStartedLoading();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void scrollArticleViewTo(int y) {
        IntercomArticleActivity.access$getViewModel(this.this$0).scrollArticleViewTo(y);
    }
}
