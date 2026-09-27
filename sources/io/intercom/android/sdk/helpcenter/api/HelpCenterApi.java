package io.intercom.android.sdk.helpcenter.api;

import defpackage.lxd;
import defpackage.ppd;
import defpackage.py2;
import defpackage.ug1;
import defpackage.zif;
import io.intercom.android.sdk.helpcenter.articles.ArticleResponse;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0002\u0010\tJ4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\b2\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0002\u0010\rJF\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0002\u0010\u0012J^\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\b2\b\b\u0003\u0010\u0019\u001a\u00020\u001a2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0002\u0010\u001bJ4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0015\u001a\u00020\b2\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0002\u0010\r¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "", "fetchCollections", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "options", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCollectionDetails", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchForArticles", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "searchPhrase", "articleSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reactToArticle", "", "articleId", "reactionIndex", "", "articleContentId", "allowAutoResponses", "", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchArticle", "Lio/intercom/android/sdk/helpcenter/articles/ArticleResponse;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HelpCenterApi {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchArticle$default(HelpCenterApi helpCenterApi, String str, Map map, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.fetchArticle(str, map, continuation);
            }
            py2.f("Super calls with default arguments not supported in this target, function: fetchArticle");
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchCollectionDetails$default(HelpCenterApi helpCenterApi, String str, Map map, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.fetchCollectionDetails(str, map, continuation);
            }
            py2.f("Super calls with default arguments not supported in this target, function: fetchCollectionDetails");
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchCollections$default(HelpCenterApi helpCenterApi, Map map, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.fetchCollections(map, continuation);
            }
            py2.f("Super calls with default arguments not supported in this target, function: fetchCollections");
            return null;
        }

        public static /* synthetic */ Object reactToArticle$default(HelpCenterApi helpCenterApi, String str, int i, String str2, boolean z, String str3, Map map, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    z = false;
                }
                boolean z2 = z;
                if ((i2 & 16) != 0) {
                    str3 = null;
                }
                String str4 = str3;
                if ((i2 & 32) != 0) {
                    map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.reactToArticle(str, i, str2, z2, str4, map, continuation);
            }
            py2.f("Super calls with default arguments not supported in this target, function: reactToArticle");
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object searchForArticles$default(HelpCenterApi helpCenterApi, String str, String str2, Map map, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.searchForArticles(str, str2, map, continuation);
            }
            py2.f("Super calls with default arguments not supported in this target, function: searchForArticles");
            return null;
        }
    }

    @ppd("articles/{articleId}")
    Object fetchArticle(@lxd("articleId") String str, @ug1 Map<String, String> map, Continuation<? super NetworkResponse<ArticleResponse>> continuation);

    @ppd("help_center/collections/{id}")
    Object fetchCollectionDetails(@lxd("id") String str, @ug1 Map<String, String> map, Continuation<? super NetworkResponse<HelpCenterCollectionContent>> continuation);

    @ppd("help_center/collections")
    Object fetchCollections(@ug1 Map<String, String> map, Continuation<? super NetworkResponse<? extends List<HelpCenterCollection>>> continuation);

    @ppd("articles/{articleId}/react")
    Object reactToArticle(@lxd("articleId") String str, @zif("reaction_index") int i, @zif("article_content_id") String str2, @zif("allow_auto_responses") boolean z, @zif("article_source") String str3, @ug1 Map<String, String> map, Continuation<? super NetworkResponse<Unit>> continuation);

    @ppd("help_center/search")
    Object searchForArticles(@zif("phrase") String str, @zif("article_source") String str2, @ug1 Map<String, String> map, Continuation<? super NetworkResponse<? extends List<HelpCenterArticleSearchResponse>>> continuation);
}
