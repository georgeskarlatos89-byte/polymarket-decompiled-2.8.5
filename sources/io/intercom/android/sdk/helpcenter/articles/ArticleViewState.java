package io.intercom.android.sdk.helpcenter.articles;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.hdi;
import defpackage.sv6;
import defpackage.ug7;
import defpackage.woa;
import defpackage.ww4;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "", "<init>", "()V", "Initial", "Content", "TeamPresenceState", "ConversationState", "ReactionState", "WebViewStatus", "Error", "Reaction", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Initial;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ArticleViewState {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020#H×\u0001J\t\u0010$\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "articleUrl", "", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "webViewStatus", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "reactionState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "getArticleUrl", "()Ljava/lang/String;", "getArticleMetadata", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "getWebViewStatus", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "getReactionState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Content extends ArticleViewState {
        public static final int $stable = 0;
        private final ArticleMetadata articleMetadata;
        private final String articleUrl;
        private final ReactionState reactionState;
        private final TeamPresenceState teamPresenceState;
        private final WebViewStatus webViewStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(String str, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState) {
            super(null);
            str.getClass();
            webViewStatus.getClass();
            reactionState.getClass();
            teamPresenceState.getClass();
            this.articleUrl = str;
            this.articleMetadata = articleMetadata;
            this.webViewStatus = webViewStatus;
            this.reactionState = reactionState;
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ Content copy$default(Content content, String str, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = content.articleUrl;
            }
            if ((i & 2) != 0) {
                articleMetadata = content.articleMetadata;
            }
            if ((i & 4) != 0) {
                webViewStatus = content.webViewStatus;
            }
            if ((i & 8) != 0) {
                reactionState = content.reactionState;
            }
            if ((i & 16) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            TeamPresenceState teamPresenceState2 = teamPresenceState;
            WebViewStatus webViewStatus2 = webViewStatus;
            return content.copy(str, articleMetadata, webViewStatus2, reactionState, teamPresenceState2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getArticleUrl() {
            return this.articleUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        /* renamed from: component3, reason: from getter */
        public final WebViewStatus getWebViewStatus() {
            return this.webViewStatus;
        }

        /* renamed from: component4, reason: from getter */
        public final ReactionState getReactionState() {
            return this.reactionState;
        }

        /* renamed from: component5, reason: from getter */
        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public final Content copy(String articleUrl, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState) {
            articleUrl.getClass();
            webViewStatus.getClass();
            reactionState.getClass();
            teamPresenceState.getClass();
            return new Content(articleUrl, articleMetadata, webViewStatus, reactionState, teamPresenceState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            if (Intrinsics.areEqual(this.articleUrl, content.articleUrl) && Intrinsics.areEqual(this.articleMetadata, content.articleMetadata) && this.webViewStatus == content.webViewStatus && Intrinsics.areEqual(this.reactionState, content.reactionState) && Intrinsics.areEqual(this.teamPresenceState, content.teamPresenceState)) {
                return true;
            }
            return false;
        }

        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        public final String getArticleUrl() {
            return this.articleUrl;
        }

        public final ReactionState getReactionState() {
            return this.reactionState;
        }

        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public final WebViewStatus getWebViewStatus() {
            return this.webViewStatus;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.articleUrl.hashCode() * 31;
            ArticleMetadata articleMetadata = this.articleMetadata;
            if (articleMetadata == null) {
                hashCode = 0;
            } else {
                hashCode = articleMetadata.hashCode();
            }
            return this.teamPresenceState.hashCode() + ((this.reactionState.hashCode() + ((this.webViewStatus.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Content(articleUrl=" + this.articleUrl + ", articleMetadata=" + this.articleMetadata + ", webViewStatus=" + this.webViewStatus + ", reactionState=" + this.reactionState + ", teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "message", "", "retryButtonVisibility", "retryButtonPrimaryColor", "<init>", "(III)V", "getMessage", "()I", "getRetryButtonVisibility", "getRetryButtonPrimaryColor", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Error extends ArticleViewState {
        public static final int $stable = 0;
        private final int message;
        private final int retryButtonPrimaryColor;
        private final int retryButtonVisibility;

        public Error(int i, int i2, int i3) {
            super(null);
            this.message = i;
            this.retryButtonVisibility = i2;
            this.retryButtonPrimaryColor = i3;
        }

        public static /* synthetic */ Error copy$default(Error error, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = error.message;
            }
            if ((i4 & 2) != 0) {
                i2 = error.retryButtonVisibility;
            }
            if ((i4 & 4) != 0) {
                i3 = error.retryButtonPrimaryColor;
            }
            return error.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRetryButtonVisibility() {
            return this.retryButtonVisibility;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRetryButtonPrimaryColor() {
            return this.retryButtonPrimaryColor;
        }

        public final Error copy(int message, int retryButtonVisibility, int retryButtonPrimaryColor) {
            return new Error(message, retryButtonVisibility, retryButtonPrimaryColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            if (this.message == error.message && this.retryButtonVisibility == error.retryButtonVisibility && this.retryButtonPrimaryColor == error.retryButtonPrimaryColor) {
                return true;
            }
            return false;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getRetryButtonPrimaryColor() {
            return this.retryButtonPrimaryColor;
        }

        public final int getRetryButtonVisibility() {
            return this.retryButtonVisibility;
        }

        public int hashCode() {
            return Integer.hashCode(this.retryButtonPrimaryColor) + woa.b(this.retryButtonVisibility, Integer.hashCode(this.message) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(this.message);
            sb.append(", retryButtonVisibility=");
            sb.append(this.retryButtonVisibility);
            sb.append(", retryButtonPrimaryColor=");
            return sv6.o(sb, this.retryButtonPrimaryColor, ')');
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Initial;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Initial extends ArticleViewState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Sad", "Neutral", "Happy", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Reaction {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Reaction[] $VALUES;
        public static final Reaction None = new Reaction("None", 0);
        public static final Reaction Sad = new Reaction("Sad", 1);
        public static final Reaction Neutral = new Reaction("Neutral", 2);
        public static final Reaction Happy = new Reaction("Happy", 3);

        private static final /* synthetic */ Reaction[] $values() {
            return new Reaction[]{None, Sad, Neutral, Happy};
        }

        static {
            Reaction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
        }

        private Reaction(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Reaction valueOf(String str) {
            return (Reaction) Enum.valueOf(Reaction.class, str);
        }

        public static Reaction[] values() {
            return (Reaction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Idle", "Loading", "Ready", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class WebViewStatus {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ WebViewStatus[] $VALUES;
        public static final WebViewStatus Idle = new WebViewStatus("Idle", 0);
        public static final WebViewStatus Loading = new WebViewStatus("Loading", 1);
        public static final WebViewStatus Ready = new WebViewStatus("Ready", 2);

        private static final /* synthetic */ WebViewStatus[] $values() {
            return new WebViewStatus[]{Idle, Loading, Ready};
        }

        static {
            WebViewStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
        }

        private WebViewStatus(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static WebViewStatus valueOf(String str) {
            return (WebViewStatus) Enum.valueOf(WebViewStatus.class, str);
        }

        public static WebViewStatus[] values() {
            return (WebViewStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ArticleViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "", "reactionComponentVisibility", "", "selectedReaction", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;", "teamHelpVisibility", "shouldScrollToBottom", "", "<init>", "(ILio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;IZ)V", "getReactionComponentVisibility", "()I", "getSelectedReaction", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;", "getTeamHelpVisibility", "getShouldScrollToBottom", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class ReactionState {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final ReactionState defaultReactionState = new ReactionState(8, null, 8, false, 2, null);
        private final int reactionComponentVisibility;
        private final Reaction selectedReaction;
        private final boolean shouldScrollToBottom;
        private final int teamHelpVisibility;

        public ReactionState(int i, Reaction reaction, int i2, boolean z) {
            reaction.getClass();
            this.reactionComponentVisibility = i;
            this.selectedReaction = reaction;
            this.teamHelpVisibility = i2;
            this.shouldScrollToBottom = z;
        }

        public static final /* synthetic */ ReactionState access$getDefaultReactionState$cp() {
            return defaultReactionState;
        }

        public static /* synthetic */ ReactionState copy$default(ReactionState reactionState, int i, Reaction reaction, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = reactionState.reactionComponentVisibility;
            }
            if ((i3 & 2) != 0) {
                reaction = reactionState.selectedReaction;
            }
            if ((i3 & 4) != 0) {
                i2 = reactionState.teamHelpVisibility;
            }
            if ((i3 & 8) != 0) {
                z = reactionState.shouldScrollToBottom;
            }
            return reactionState.copy(i, reaction, i2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getReactionComponentVisibility() {
            return this.reactionComponentVisibility;
        }

        /* renamed from: component2, reason: from getter */
        public final Reaction getSelectedReaction() {
            return this.selectedReaction;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTeamHelpVisibility() {
            return this.teamHelpVisibility;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldScrollToBottom() {
            return this.shouldScrollToBottom;
        }

        public final ReactionState copy(int reactionComponentVisibility, Reaction selectedReaction, int teamHelpVisibility, boolean shouldScrollToBottom) {
            selectedReaction.getClass();
            return new ReactionState(reactionComponentVisibility, selectedReaction, teamHelpVisibility, shouldScrollToBottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactionState)) {
                return false;
            }
            ReactionState reactionState = (ReactionState) other;
            if (this.reactionComponentVisibility == reactionState.reactionComponentVisibility && this.selectedReaction == reactionState.selectedReaction && this.teamHelpVisibility == reactionState.teamHelpVisibility && this.shouldScrollToBottom == reactionState.shouldScrollToBottom) {
                return true;
            }
            return false;
        }

        public final int getReactionComponentVisibility() {
            return this.reactionComponentVisibility;
        }

        public final Reaction getSelectedReaction() {
            return this.selectedReaction;
        }

        public final boolean getShouldScrollToBottom() {
            return this.shouldScrollToBottom;
        }

        public final int getTeamHelpVisibility() {
            return this.teamHelpVisibility;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldScrollToBottom) + woa.b(this.teamHelpVisibility, (this.selectedReaction.hashCode() + (Integer.hashCode(this.reactionComponentVisibility) * 31)) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ReactionState(reactionComponentVisibility=");
            sb.append(this.reactionComponentVisibility);
            sb.append(", selectedReaction=");
            sb.append(this.selectedReaction);
            sb.append(", teamHelpVisibility=");
            sb.append(this.teamHelpVisibility);
            sb.append(", shouldScrollToBottom=");
            return hdi.t(sb, this.shouldScrollToBottom, ')');
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState$Companion;", "", "<init>", "()V", "defaultReactionState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "getDefaultReactionState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ReactionState getDefaultReactionState() {
                return ReactionState.access$getDefaultReactionState$cp();
            }

            private Companion() {
            }
        }

        public /* synthetic */ ReactionState(int i, Reaction reaction, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? Reaction.None : reaction, i2, z);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00015Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jz\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÇ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00103\u001a\u00020\u0007H×\u0001J\t\u00104\u001a\u00020\fH×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "conversationState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "subtitleText", "", "messageButtonText", "messageButtonIcon", "messageButtonColor", "metricPlace", "", "metricContext", "isFromSearchBrowse", "", "ctaData", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "<init>", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;)V", "getArticleMetadata", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "getConversationState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "getSubtitleText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessageButtonText", "()I", "getMessageButtonIcon", "getMessageButtonColor", "getMetricPlace", "()Ljava/lang/String;", "getMetricContext", "()Z", "getCtaData", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;)Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "equals", "other", "hashCode", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class TeamPresenceState {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final TeamPresenceState defaultTeamPresenceState = new TeamPresenceState(null, null, Integer.valueOf(R.string.intercom_the_team_can_help_if_needed), R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, -16777216, "article", MetricTracker.Context.STYLE_HUMAN, false, null, Barcode.FORMAT_UPC_A, null);
        private final ArticleMetadata articleMetadata;
        private final ConversationState conversationState;
        private final OpenMessengerResponse.NewConversationData.Cta ctaData;
        private final boolean isFromSearchBrowse;
        private final int messageButtonColor;
        private final int messageButtonIcon;
        private final int messageButtonText;
        private final String metricContext;
        private final String metricPlace;
        private final Integer subtitleText;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TeamPresenceState(ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i, int i2, int i3, String str, String str2, boolean z, OpenMessengerResponse.NewConversationData.Cta cta, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(articleMetadata, conversationState, num, i, i2, i3, str, str2, r11, r12);
            boolean z2;
            OpenMessengerResponse.NewConversationData.Cta cta2;
            if ((i4 & 256) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i4 & Barcode.FORMAT_UPC_A) != 0) {
                cta2 = null;
            } else {
                cta2 = cta;
            }
        }

        public static final /* synthetic */ TeamPresenceState access$getDefaultTeamPresenceState$cp() {
            return defaultTeamPresenceState;
        }

        public static /* synthetic */ TeamPresenceState copy$default(TeamPresenceState teamPresenceState, ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i, int i2, int i3, String str, String str2, boolean z, OpenMessengerResponse.NewConversationData.Cta cta, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                articleMetadata = teamPresenceState.articleMetadata;
            }
            if ((i4 & 2) != 0) {
                conversationState = teamPresenceState.conversationState;
            }
            if ((i4 & 4) != 0) {
                num = teamPresenceState.subtitleText;
            }
            if ((i4 & 8) != 0) {
                i = teamPresenceState.messageButtonText;
            }
            if ((i4 & 16) != 0) {
                i2 = teamPresenceState.messageButtonIcon;
            }
            if ((i4 & 32) != 0) {
                i3 = teamPresenceState.messageButtonColor;
            }
            if ((i4 & 64) != 0) {
                str = teamPresenceState.metricPlace;
            }
            if ((i4 & 128) != 0) {
                str2 = teamPresenceState.metricContext;
            }
            if ((i4 & 256) != 0) {
                z = teamPresenceState.isFromSearchBrowse;
            }
            if ((i4 & Barcode.FORMAT_UPC_A) != 0) {
                cta = teamPresenceState.ctaData;
            }
            boolean z2 = z;
            OpenMessengerResponse.NewConversationData.Cta cta2 = cta;
            String str3 = str;
            String str4 = str2;
            int i5 = i2;
            int i6 = i3;
            return teamPresenceState.copy(articleMetadata, conversationState, num, i, i5, i6, str3, str4, z2, cta2);
        }

        /* renamed from: component1, reason: from getter */
        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        /* renamed from: component10, reason: from getter */
        public final OpenMessengerResponse.NewConversationData.Cta getCtaData() {
            return this.ctaData;
        }

        /* renamed from: component2, reason: from getter */
        public final ConversationState getConversationState() {
            return this.conversationState;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getSubtitleText() {
            return this.subtitleText;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMessageButtonIcon() {
            return this.messageButtonIcon;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMessageButtonColor() {
            return this.messageButtonColor;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMetricContext() {
            return this.metricContext;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public final TeamPresenceState copy(ArticleMetadata articleMetadata, ConversationState conversationState, Integer subtitleText, int messageButtonText, int messageButtonIcon, int messageButtonColor, String metricPlace, String metricContext, boolean isFromSearchBrowse, OpenMessengerResponse.NewConversationData.Cta ctaData) {
            metricPlace.getClass();
            metricContext.getClass();
            return new TeamPresenceState(articleMetadata, conversationState, subtitleText, messageButtonText, messageButtonIcon, messageButtonColor, metricPlace, metricContext, isFromSearchBrowse, ctaData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TeamPresenceState)) {
                return false;
            }
            TeamPresenceState teamPresenceState = (TeamPresenceState) other;
            if (Intrinsics.areEqual(this.articleMetadata, teamPresenceState.articleMetadata) && Intrinsics.areEqual(this.conversationState, teamPresenceState.conversationState) && Intrinsics.areEqual(this.subtitleText, teamPresenceState.subtitleText) && this.messageButtonText == teamPresenceState.messageButtonText && this.messageButtonIcon == teamPresenceState.messageButtonIcon && this.messageButtonColor == teamPresenceState.messageButtonColor && Intrinsics.areEqual(this.metricPlace, teamPresenceState.metricPlace) && Intrinsics.areEqual(this.metricContext, teamPresenceState.metricContext) && this.isFromSearchBrowse == teamPresenceState.isFromSearchBrowse && Intrinsics.areEqual(this.ctaData, teamPresenceState.ctaData)) {
                return true;
            }
            return false;
        }

        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        public final ConversationState getConversationState() {
            return this.conversationState;
        }

        public final OpenMessengerResponse.NewConversationData.Cta getCtaData() {
            return this.ctaData;
        }

        public final int getMessageButtonColor() {
            return this.messageButtonColor;
        }

        public final int getMessageButtonIcon() {
            return this.messageButtonIcon;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public final String getMetricContext() {
            return this.metricContext;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final Integer getSubtitleText() {
            return this.subtitleText;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            ArticleMetadata articleMetadata = this.articleMetadata;
            int i = 0;
            if (articleMetadata == null) {
                hashCode = 0;
            } else {
                hashCode = articleMetadata.hashCode();
            }
            int i2 = hashCode * 31;
            ConversationState conversationState = this.conversationState;
            if (conversationState == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = conversationState.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            Integer num = this.subtitleText;
            if (num == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = num.hashCode();
            }
            int g = hdi.g(hdi.e(hdi.e(woa.b(this.messageButtonColor, woa.b(this.messageButtonIcon, woa.b(this.messageButtonText, (i3 + hashCode3) * 31, 31), 31), 31), 31, this.metricPlace), 31, this.metricContext), 31, this.isFromSearchBrowse);
            OpenMessengerResponse.NewConversationData.Cta cta = this.ctaData;
            if (cta != null) {
                i = cta.hashCode();
            }
            return g + i;
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public String toString() {
            return "TeamPresenceState(articleMetadata=" + this.articleMetadata + ", conversationState=" + this.conversationState + ", subtitleText=" + this.subtitleText + ", messageButtonText=" + this.messageButtonText + ", messageButtonIcon=" + this.messageButtonIcon + ", messageButtonColor=" + this.messageButtonColor + ", metricPlace=" + this.metricPlace + ", metricContext=" + this.metricContext + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ", ctaData=" + this.ctaData + ')';
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState$Companion;", "", "<init>", "()V", "defaultTeamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "getDefaultTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TeamPresenceState getDefaultTeamPresenceState() {
                return TeamPresenceState.access$getDefaultTeamPresenceState$cp();
            }

            private Companion() {
            }
        }

        public TeamPresenceState(ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i, int i2, int i3, String str, String str2, boolean z, OpenMessengerResponse.NewConversationData.Cta cta) {
            str.getClass();
            str2.getClass();
            this.articleMetadata = articleMetadata;
            this.conversationState = conversationState;
            this.subtitleText = num;
            this.messageButtonText = i;
            this.messageButtonIcon = i2;
            this.messageButtonColor = i3;
            this.metricPlace = str;
            this.metricContext = str2;
            this.isFromSearchBrowse = z;
            this.ctaData = cta;
        }
    }

    private ArticleViewState() {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0005H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "", "conversationId", "", "messageButtonText", "", "<init>", "(Ljava/lang/String;I)V", "getConversationId", "()Ljava/lang/String;", "getMessageButtonText", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class ConversationState {
        public static final int $stable = 0;
        private final String conversationId;
        private final int messageButtonText;

        public ConversationState(String str, int i) {
            str.getClass();
            this.conversationId = str;
            this.messageButtonText = i;
        }

        public static /* synthetic */ ConversationState copy$default(ConversationState conversationState, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = conversationState.conversationId;
            }
            if ((i2 & 2) != 0) {
                i = conversationState.messageButtonText;
            }
            return conversationState.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public final ConversationState copy(String conversationId, int messageButtonText) {
            conversationId.getClass();
            return new ConversationState(conversationId, messageButtonText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationState)) {
                return false;
            }
            ConversationState conversationState = (ConversationState) other;
            if (Intrinsics.areEqual(this.conversationId, conversationState.conversationId) && this.messageButtonText == conversationState.messageButtonText) {
                return true;
            }
            return false;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageButtonText) + (this.conversationId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ConversationState(conversationId=");
            sb.append(this.conversationId);
            sb.append(", messageButtonText=");
            return sv6.o(sb, this.messageButtonText, ')');
        }

        public /* synthetic */ ConversationState(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? R.string.intercom_continue_the_conversation : i);
        }
    }
}
