package io.intercom.android.sdk.m5.push;

import android.content.Context;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.intercom.twig.Twig;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ada;
import defpackage.bin;
import defpackage.hdi;
import defpackage.izm;
import defpackage.k84;
import defpackage.lda;
import defpackage.m51;
import defpackage.woa;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.ui.common.ActualStringOrResKt;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0014J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0014J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0014J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0014J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0014J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0014J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0014J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u0014J\u009c\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0014J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00192\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010\u0014R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\bA\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bB\u0010\u0014R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bC\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b\u001d\u0010\u0014R\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010I\u001a\n H*\u0004\u0018\u00010G0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lio/intercom/android/sdk/m5/push/SimplePushData;", "", "", "intercomPushType", "conversationId", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "message", "body", "receiver", "authorName", "appName", "contentImageUrl", "imageUrl", "uri", "instanceId", "conversationPartType", "messageData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentText", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "getContentTitle", "(Landroid/content/Context;)Ljava/lang/String;", "", "isIntercomPush", "()Z", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "getMessageData", "()Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/m5/push/SimplePushData;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIntercomPushType", "getConversationId", "getTitle", "getMessage", "getBody", "getReceiver", "getAuthorName", "getAppName", "getContentImageUrl", "getImageUrl", "getUri", "getInstanceId", "getConversationPartType", "Lada;", "json", "Lada;", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "twig", "Lcom/intercom/twig/Twig;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class SimplePushData {
    private final String appName;
    private final String authorName;
    private final String body;
    private final String contentImageUrl;
    private final String conversationId;
    private final String conversationPartType;
    private final String imageUrl;
    private final String instanceId;
    private final String intercomPushType;
    private final ada json;
    private final String message;
    private final String messageData;
    private final String receiver;
    private final String title;
    private final Twig twig;
    private final String uri;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public SimplePushData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        k84.p(str, str2, str3, str4, str5);
        k84.p(str6, str7, str8, str9, str10);
        woa.A(str11, str12, str13, str14);
        this.intercomPushType = str;
        this.conversationId = str2;
        this.title = str3;
        this.message = str4;
        this.body = str5;
        this.receiver = str6;
        this.authorName = str7;
        this.appName = str8;
        this.contentImageUrl = str9;
        this.imageUrl = str10;
        this.uri = str11;
        this.instanceId = str12;
        this.conversationPartType = str13;
        this.messageData = str14;
        this.json = izm.a(new Object());
        this.twig = LumberMill.getLogger();
    }

    public static /* synthetic */ Unit a(lda ldaVar) {
        return json$lambda$0(ldaVar);
    }

    public static /* synthetic */ SimplePushData copy$default(SimplePushData simplePushData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        if ((i & 1) != 0) {
            str15 = simplePushData.intercomPushType;
        } else {
            str15 = str;
        }
        if ((i & 2) != 0) {
            str16 = simplePushData.conversationId;
        } else {
            str16 = str2;
        }
        if ((i & 4) != 0) {
            str17 = simplePushData.title;
        } else {
            str17 = str3;
        }
        if ((i & 8) != 0) {
            str18 = simplePushData.message;
        } else {
            str18 = str4;
        }
        if ((i & 16) != 0) {
            str19 = simplePushData.body;
        } else {
            str19 = str5;
        }
        if ((i & 32) != 0) {
            str20 = simplePushData.receiver;
        } else {
            str20 = str6;
        }
        if ((i & 64) != 0) {
            str21 = simplePushData.authorName;
        } else {
            str21 = str7;
        }
        if ((i & 128) != 0) {
            str22 = simplePushData.appName;
        } else {
            str22 = str8;
        }
        if ((i & 256) != 0) {
            str23 = simplePushData.contentImageUrl;
        } else {
            str23 = str9;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            str24 = simplePushData.imageUrl;
        } else {
            str24 = str10;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            str25 = simplePushData.uri;
        } else {
            str25 = str11;
        }
        if ((i & 2048) != 0) {
            str26 = simplePushData.instanceId;
        } else {
            str26 = str12;
        }
        if ((i & 4096) != 0) {
            str27 = simplePushData.conversationPartType;
        } else {
            str27 = str13;
        }
        if ((i & 8192) != 0) {
            str28 = simplePushData.messageData;
        } else {
            str28 = str14;
        }
        return simplePushData.copy(str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28);
    }

    private static final Unit json$lambda$0(lda ldaVar) {
        ldaVar.getClass();
        ldaVar.c = true;
        return Unit.INSTANCE;
    }

    /* renamed from: component1, reason: from getter */
    public final String getIntercomPushType() {
        return this.intercomPushType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component12, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getConversationPartType() {
        return this.conversationPartType;
    }

    /* renamed from: component14, reason: from getter */
    public final String getMessageData() {
        return this.messageData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReceiver() {
        return this.receiver;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    public final SimplePushData copy(String intercomPushType, String conversationId, String title, String message, String body, String receiver, String authorName, String appName, String contentImageUrl, String imageUrl, String uri, String instanceId, String conversationPartType, String messageData) {
        k84.p(intercomPushType, conversationId, title, message, body);
        k84.p(receiver, authorName, appName, contentImageUrl, imageUrl);
        uri.getClass();
        instanceId.getClass();
        conversationPartType.getClass();
        messageData.getClass();
        return new SimplePushData(intercomPushType, conversationId, title, message, body, receiver, authorName, appName, contentImageUrl, imageUrl, uri, instanceId, conversationPartType, messageData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimplePushData)) {
            return false;
        }
        SimplePushData simplePushData = (SimplePushData) other;
        if (Intrinsics.areEqual(this.intercomPushType, simplePushData.intercomPushType) && Intrinsics.areEqual(this.conversationId, simplePushData.conversationId) && Intrinsics.areEqual(this.title, simplePushData.title) && Intrinsics.areEqual(this.message, simplePushData.message) && Intrinsics.areEqual(this.body, simplePushData.body) && Intrinsics.areEqual(this.receiver, simplePushData.receiver) && Intrinsics.areEqual(this.authorName, simplePushData.authorName) && Intrinsics.areEqual(this.appName, simplePushData.appName) && Intrinsics.areEqual(this.contentImageUrl, simplePushData.contentImageUrl) && Intrinsics.areEqual(this.imageUrl, simplePushData.imageUrl) && Intrinsics.areEqual(this.uri, simplePushData.uri) && Intrinsics.areEqual(this.instanceId, simplePushData.instanceId) && Intrinsics.areEqual(this.conversationPartType, simplePushData.conversationPartType) && Intrinsics.areEqual(this.messageData, simplePushData.messageData)) {
            return true;
        }
        return false;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    public final String getContentText() {
        String str = this.message;
        if (StringsKt.T(str)) {
            return this.body;
        }
        return str;
    }

    public final String getContentTitle(Context context) {
        context.getClass();
        if (!StringsKt.T(this.title)) {
            return this.title;
        }
        if (!StringsKt.T(this.authorName) && !StringsKt.T(this.appName)) {
            return ActualStringOrResKt.parseString(context, R.string.intercom_teammate_from_company, CollectionsKt.listOf(new Pair(Keys.KEY_NAME, this.authorName), new Pair("company", this.appName)));
        }
        if (!StringsKt.T(this.authorName)) {
            return this.authorName;
        }
        return this.appName;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationPartType() {
        return this.conversationPartType;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final String getIntercomPushType() {
        return this.intercomPushType;
    }

    public final String getMessage() {
        return this.message;
    }

    public final IntercomPushData.ConversationPushData.MessageData getMessageData() {
        if (!StringsKt.T(this.body)) {
            return new IntercomPushData.ConversationPushData.MessageData.Text(this.body);
        }
        if (StringsKt.T(this.messageData)) {
            return null;
        }
        try {
            ada adaVar = this.json;
            String str = this.messageData;
            adaVar.getClass();
            return (IntercomPushData.ConversationPushData.MessageData) adaVar.b(str, bin.c(IntercomPushData.ConversationPushData.MessageData.INSTANCE.serializer()));
        } catch (IllegalArgumentException e) {
            this.twig.e(e);
            return null;
        }
    }

    public final String getReceiver() {
        return this.receiver;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.messageData.hashCode() + hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(this.intercomPushType.hashCode() * 31, 31, this.conversationId), 31, this.title), 31, this.message), 31, this.body), 31, this.receiver), 31, this.authorName), 31, this.appName), 31, this.contentImageUrl), 31, this.imageUrl), 31, this.uri), 31, this.instanceId), 31, this.conversationPartType);
    }

    public final boolean isIntercomPush() {
        if (!StringsKt.T(this.intercomPushType) && Intrinsics.areEqual(Intercom.PUSH_RECEIVER, this.receiver)) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SimplePushData(intercomPushType=");
        sb.append(this.intercomPushType);
        sb.append(", conversationId=");
        sb.append(this.conversationId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", receiver=");
        sb.append(this.receiver);
        sb.append(", authorName=");
        sb.append(this.authorName);
        sb.append(", appName=");
        sb.append(this.appName);
        sb.append(", contentImageUrl=");
        sb.append(this.contentImageUrl);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", instanceId=");
        sb.append(this.instanceId);
        sb.append(", conversationPartType=");
        sb.append(this.conversationPartType);
        sb.append(", messageData=");
        return m51.m(sb, this.messageData, ')');
    }

    /* renamed from: getMessageData, reason: collision with other method in class */
    public final String m369getMessageData() {
        return this.messageData;
    }
}
