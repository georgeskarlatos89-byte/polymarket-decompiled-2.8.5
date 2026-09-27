package io.intercom.android.sdk.m5;

import android.content.Context;
import android.content.Intent;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001aD\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\b\u0002\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0000\u001a<\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0010"}, d2 = {"getConversationIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "conversationId", "", "getComposerIntent", "initialMessage", "isLaunchedProgrammatically", "", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "activityName", "Ljava/lang/Class;", "openComposer", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConversationScreenOpenerKt {
    public static final Intent getComposerIntent(Context context, String str, boolean z, ArticleMetadata articleMetadata, String str2, Class<?> cls) {
        String str3;
        context.getClass();
        str.getClass();
        cls.getClass();
        String str4 = null;
        if (articleMetadata != null) {
            str3 = articleMetadata.getId();
        } else {
            str3 = null;
        }
        if (articleMetadata != null) {
            str4 = articleMetadata.getTitle();
        }
        return IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(str2, str, z, str3, str4, null, 32, null), cls, null, 8, null);
    }

    public static /* synthetic */ Intent getComposerIntent$default(Context context, String str, boolean z, ArticleMetadata articleMetadata, String str2, Class cls, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 32) != 0) {
            cls = IntercomRootActivity.class;
        }
        return getComposerIntent(context, str, z, articleMetadata, str2, cls);
    }

    public static final Intent getConversationIntent(Context context, String str) {
        context.getClass();
        return IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(str, "", false, null, null, null, 48, null), null, null, 12, null);
    }

    public static final void openComposer(Context context, String str, boolean z, ArticleMetadata articleMetadata, String str2) {
        context.getClass();
        str.getClass();
        context.startActivity(getComposerIntent$default(context, str, z, articleMetadata, str2, null, 32, null));
    }

    public static /* synthetic */ void openComposer$default(Context context, String str, boolean z, ArticleMetadata articleMetadata, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            articleMetadata = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        openComposer(context, str, z, articleMetadata, str2);
    }
}
