package com.polymarket.data;

import com.checkout.components.wallet.BuildConfig;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bO\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u008d\u0001\u008e\u0001\u008f\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBµ\u0001\b\u0016\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\t\u0010 B\u0011\b\u0012\u0012\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\"J\u0006\u0010'\u001a\u00020(J\u0015\u0010)\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020.H\u0016J\u0015\u00104\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00105\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00106\u001a\u00020\fH\u0082 J\u0015\u00109\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010:\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00106\u001a\u00020\fH\u0082 J\u0015\u0010=\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010>\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00106\u001a\u00020\fH\u0082 J\u0015\u0010C\u001a\u00020\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010D\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00106\u001a\u00020\u0010H\u0082 J\u0017\u0010G\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010H\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00106\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0017\u0010K\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010L\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00106\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0017\u0010O\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010P\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00106\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010U\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010V\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00106\u001a\u00020\u0015H\u0082 J\u0015\u0010[\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\\\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00106\u001a\u00020\u0017H\u0082 J\u0015\u0010a\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010b\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00106\u001a\u00020\u0019H\u0082 J\u0015\u0010e\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010f\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00106\u001a\u00020\u0019H\u0082 J\u0015\u0010i\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010j\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00106\u001a\u00020\u0019H\u0082 J\u0017\u0010m\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010n\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00106\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010q\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010r\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00106\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010u\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010v\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00106\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010y\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010z\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00106\u001a\u00020\u0019H\u0082 J\u009b\u0001\u0010{\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001f\u001a\u00020\u0019H\u0082 J\u0015\u0010|\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010!\u001a\u00020\u0001H\u0082 J\t\u0010\u0088\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020,0\u008a\u00012\u0007\u0010\u008b\u0001\u001a\u00020.H\u0016J\u001a\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020,0\u008a\u00012\u0007\u0010\u008b\u0001\u001a\u00020.H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00101\"\u0004\b8\u00103R$\u0010\u000e\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00101\"\u0004\b<\u00103R$\u0010\u000f\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010/\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR(\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010/\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR(\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u00101\"\u0004\bN\u00103R$\u0010\u0014\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\u0016\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010\u0018\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010^\"\u0004\bh\u0010`R(\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u00101\"\u0004\bl\u00103R(\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u00101\"\u0004\bp\u00103R(\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u00101\"\u0004\bt\u00103R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010^\"\u0004\bx\u0010`R+\u0010}\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020(\u0018\u00010~X\u0096\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001f\u0010\u0083\u0001\u001a\u00020.X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0090\u0001"}, d2 = {"Lcom/polymarket/data/EHomePageMarketingCampaign;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "url", "Ljava/net/URI;", "imageURL", "backgroundImageURL", "backgroundColorHex", "textStyle", "Lcom/polymarket/data/EHomePageMarketingCampaign$TextStyle;", "kind", "Lcom/polymarket/data/EHomePageMarketingCampaign$Kind;", "includesReferralCount", "", "includesUsername", "hidesDismissButton", "relatedCampaignId", "optedInTitle", "optedInSubtitle", "optedInHidesDismissButton", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Ljava/net/URI;Ljava/net/URI;Ljava/lang/String;Lcom/polymarket/data/EHomePageMarketingCampaign$TextStyle;Lcom/polymarket/data/EHomePageMarketingCampaign$Kind;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "newValue", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "getTitle", "setTitle", "Swift_title", "Swift_title_set", "getSubtitle", "setSubtitle", "Swift_subtitle", "Swift_subtitle_set", "getUrl", "()Ljava/net/URI;", "setUrl", "(Ljava/net/URI;)V", "Swift_url", "Swift_url_set", "getImageURL", "setImageURL", "Swift_imageURL", "Swift_imageURL_set", "getBackgroundImageURL", "setBackgroundImageURL", "Swift_backgroundImageURL", "Swift_backgroundImageURL_set", "getBackgroundColorHex", "setBackgroundColorHex", "Swift_backgroundColorHex", "Swift_backgroundColorHex_set", "getTextStyle", "()Lcom/polymarket/data/EHomePageMarketingCampaign$TextStyle;", "setTextStyle", "(Lcom/polymarket/data/EHomePageMarketingCampaign$TextStyle;)V", "Swift_textStyle", "Swift_textStyle_set", "getKind", "()Lcom/polymarket/data/EHomePageMarketingCampaign$Kind;", "setKind", "(Lcom/polymarket/data/EHomePageMarketingCampaign$Kind;)V", "Swift_kind", "Swift_kind_set", "getIncludesReferralCount", "()Z", "setIncludesReferralCount", "(Z)V", "Swift_includesReferralCount", "Swift_includesReferralCount_set", "getIncludesUsername", "setIncludesUsername", "Swift_includesUsername", "Swift_includesUsername_set", "getHidesDismissButton", "setHidesDismissButton", "Swift_hidesDismissButton", "Swift_hidesDismissButton_set", "getRelatedCampaignId", "setRelatedCampaignId", "Swift_relatedCampaignId", "Swift_relatedCampaignId_set", "getOptedInTitle", "setOptedInTitle", "Swift_optedInTitle", "Swift_optedInTitle_set", "getOptedInSubtitle", "setOptedInSubtitle", "Swift_optedInSubtitle", "Swift_optedInSubtitle_set", "getOptedInHidesDismissButton", "setOptedInHidesDismissButton", "Swift_optedInHidesDismissButton", "Swift_optedInHidesDismissButton_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "TextStyle", "Kind", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EHomePageMarketingCampaign implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EHomePageMarketingCampaign(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.net.URI r24, java.net.URI r25, java.net.URI r26, java.lang.String r27, com.polymarket.data.EHomePageMarketingCampaign.TextStyle r28, com.polymarket.data.EHomePageMarketingCampaign.Kind r29, boolean r30, boolean r31, boolean r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, boolean r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = r21
        Lb:
            r1 = r0 & 2
            java.lang.String r3 = ""
            if (r1 == 0) goto L13
            r5 = r3
            goto L15
        L13:
            r5 = r22
        L15:
            r1 = r0 & 4
            if (r1 == 0) goto L1b
            r6 = r3
            goto L1d
        L1b:
            r6 = r23
        L1d:
            r1 = r0 & 16
            if (r1 == 0) goto L23
            r8 = r2
            goto L25
        L23:
            r8 = r25
        L25:
            r1 = r0 & 32
            if (r1 == 0) goto L2b
            r9 = r2
            goto L2d
        L2b:
            r9 = r26
        L2d:
            r1 = r0 & 64
            if (r1 == 0) goto L33
            r10 = r2
            goto L35
        L33:
            r10 = r27
        L35:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L3d
            com.polymarket.data.EHomePageMarketingCampaign$TextStyle r1 = com.polymarket.data.EHomePageMarketingCampaign.TextStyle.onLight
            r11 = r1
            goto L3f
        L3d:
            r11 = r28
        L3f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L47
            com.polymarket.data.EHomePageMarketingCampaign$Kind r1 = com.polymarket.data.EHomePageMarketingCampaign.Kind.standard
            r12 = r1
            goto L49
        L47:
            r12 = r29
        L49:
            r1 = r0 & 512(0x200, float:7.175E-43)
            r3 = 0
            if (r1 == 0) goto L50
            r13 = r3
            goto L52
        L50:
            r13 = r30
        L52:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L58
            r14 = r3
            goto L5a
        L58:
            r14 = r31
        L5a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L60
            r15 = r3
            goto L62
        L60:
            r15 = r32
        L62:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L69
            r16 = r2
            goto L6b
        L69:
            r16 = r33
        L6b:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L72
            r17 = r2
            goto L74
        L72:
            r17 = r34
        L74:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L7b
            r18 = r2
            goto L7d
        L7b:
            r18 = r35
        L7d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L8a
            r19 = r3
            r7 = r24
            r3 = r20
            goto L90
        L8a:
            r19 = r36
            r3 = r20
            r7 = r24
        L90:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.polymarket.data.EHomePageMarketingCampaign.<init>(java.lang.String, java.lang.String, java.lang.String, java.net.URI, java.net.URI, java.net.URI, java.lang.String, com.polymarket.data.EHomePageMarketingCampaign$TextStyle, com.polymarket.data.EHomePageMarketingCampaign$Kind, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final native String Swift_backgroundColorHex(long Swift_peer);

    private final native void Swift_backgroundColorHex_set(long Swift_peer, String value);

    private final native URI Swift_backgroundImageURL(long Swift_peer);

    private final native void Swift_backgroundImageURL_set(long Swift_peer, URI value);

    private final native long Swift_constructor_0(String id, String title, String subtitle, URI url, URI imageURL, URI backgroundImageURL, String backgroundColorHex, TextStyle textStyle, Kind kind, boolean includesReferralCount, boolean includesUsername, boolean hidesDismissButton, String relatedCampaignId, String optedInTitle, String optedInSubtitle, boolean optedInHidesDismissButton);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native boolean Swift_hidesDismissButton(long Swift_peer);

    private final native void Swift_hidesDismissButton_set(long Swift_peer, boolean value);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native URI Swift_imageURL(long Swift_peer);

    private final native void Swift_imageURL_set(long Swift_peer, URI value);

    private final native boolean Swift_includesReferralCount(long Swift_peer);

    private final native void Swift_includesReferralCount_set(long Swift_peer, boolean value);

    private final native boolean Swift_includesUsername(long Swift_peer);

    private final native void Swift_includesUsername_set(long Swift_peer, boolean value);

    private final native Kind Swift_kind(long Swift_peer);

    private final native void Swift_kind_set(long Swift_peer, Kind value);

    private final native boolean Swift_optedInHidesDismissButton(long Swift_peer);

    private final native void Swift_optedInHidesDismissButton_set(long Swift_peer, boolean value);

    private final native String Swift_optedInSubtitle(long Swift_peer);

    private final native void Swift_optedInSubtitle_set(long Swift_peer, String value);

    private final native String Swift_optedInTitle(long Swift_peer);

    private final native void Swift_optedInTitle_set(long Swift_peer, String value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_relatedCampaignId(long Swift_peer);

    private final native void Swift_relatedCampaignId_set(long Swift_peer, String value);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native void Swift_subtitle_set(long Swift_peer, String value);

    private final native TextStyle Swift_textStyle(long Swift_peer);

    private final native void Swift_textStyle_set(long Swift_peer, TextStyle value);

    private final native String Swift_title(long Swift_peer);

    private final native void Swift_title_set(long Swift_peer, String value);

    private final native URI Swift_url(long Swift_peer);

    private final native void Swift_url_set(long Swift_peer, URI value);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getBackgroundColorHex() {
        return Swift_backgroundColorHex(this.Swift_peer);
    }

    public final URI getBackgroundImageURL() {
        return Swift_backgroundImageURL(this.Swift_peer);
    }

    public final boolean getHidesDismissButton() {
        return Swift_hidesDismissButton(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final URI getImageURL() {
        return Swift_imageURL(this.Swift_peer);
    }

    public final boolean getIncludesReferralCount() {
        return Swift_includesReferralCount(this.Swift_peer);
    }

    public final boolean getIncludesUsername() {
        return Swift_includesUsername(this.Swift_peer);
    }

    public final Kind getKind() {
        return Swift_kind(this.Swift_peer);
    }

    public final boolean getOptedInHidesDismissButton() {
        return Swift_optedInHidesDismissButton(this.Swift_peer);
    }

    public final String getOptedInSubtitle() {
        return Swift_optedInSubtitle(this.Swift_peer);
    }

    public final String getOptedInTitle() {
        return Swift_optedInTitle(this.Swift_peer);
    }

    public final String getRelatedCampaignId() {
        return Swift_relatedCampaignId(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final String getSubtitle() {
        return Swift_subtitle(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final TextStyle getTextStyle() {
        return Swift_textStyle(this.Swift_peer);
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public final URI getUrl() {
        return Swift_url(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EHomePageMarketingCampaign(this);
    }

    public final void setBackgroundColorHex(String str) {
        willmutate();
        try {
            Swift_backgroundColorHex_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setBackgroundImageURL(URI uri) {
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_backgroundImageURL_set(this.Swift_peer, uri2);
        } finally {
            didmutate();
        }
    }

    public final void setHidesDismissButton(boolean z) {
        willmutate();
        try {
            Swift_hidesDismissButton_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setId(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_id_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setImageURL(URI uri) {
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_imageURL_set(this.Swift_peer, uri2);
        } finally {
            didmutate();
        }
    }

    public final void setIncludesReferralCount(boolean z) {
        willmutate();
        try {
            Swift_includesReferralCount_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setIncludesUsername(boolean z) {
        willmutate();
        try {
            Swift_includesUsername_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setKind(Kind kind) {
        kind.getClass();
        willmutate();
        try {
            Swift_kind_set(this.Swift_peer, kind);
        } finally {
            didmutate();
        }
    }

    public final void setOptedInHidesDismissButton(boolean z) {
        willmutate();
        try {
            Swift_optedInHidesDismissButton_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setOptedInSubtitle(String str) {
        willmutate();
        try {
            Swift_optedInSubtitle_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setOptedInTitle(String str) {
        willmutate();
        try {
            Swift_optedInTitle_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setRelatedCampaignId(String str) {
        willmutate();
        try {
            Swift_relatedCampaignId_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setSubtitle(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_subtitle_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final void setTextStyle(TextStyle textStyle) {
        textStyle.getClass();
        willmutate();
        try {
            Swift_textStyle_set(this.Swift_peer, textStyle);
        } finally {
            didmutate();
        }
    }

    public final void setTitle(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_title_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setUrl(URI uri) {
        uri.getClass();
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_url_set(this.Swift_peer, uri2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/EHomePageMarketingCampaign$Kind;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", BuildConfig.FLAVOR, "squadsHero", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Kind implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Kind standard = new Kind(BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, null, 2, null);
        public static final Kind squadsHero = new Kind("squadsHero", 1, "squadsHero", null, 2, null);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{standard, squadsHero};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Kind(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EHomePageMarketingCampaign$Kind$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EHomePageMarketingCampaign$Kind;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Kind init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, BuildConfig.FLAVOR)) {
                    return Kind.standard;
                }
                if (Intrinsics.areEqual(rawValue, "squadsHero")) {
                    return Kind.squadsHero;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private Kind(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/EHomePageMarketingCampaign$TextStyle;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "onLight", "onDark", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TextStyle implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ TextStyle[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final TextStyle onLight = new TextStyle("onLight", 0, "onLight", null, 2, null);
        public static final TextStyle onDark = new TextStyle("onDark", 1, "onDark", null, 2, null);

        private static final /* synthetic */ TextStyle[] $values() {
            return new TextStyle[]{onLight, onDark};
        }

        static {
            TextStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ TextStyle(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static TextStyle valueOf(String str) {
            return (TextStyle) Enum.valueOf(TextStyle.class, str);
        }

        public static TextStyle[] values() {
            return (TextStyle[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EHomePageMarketingCampaign$TextStyle$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EHomePageMarketingCampaign$TextStyle;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TextStyle init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "onLight")) {
                    return TextStyle.onLight;
                }
                if (Intrinsics.areEqual(rawValue, "onDark")) {
                    return TextStyle.onDark;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private TextStyle(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EHomePageMarketingCampaign$Companion;", "", "<init>", "()V", "TextStyle", "Lcom/polymarket/data/EHomePageMarketingCampaign$TextStyle;", "rawValue", "", "Kind", "Lcom/polymarket/data/EHomePageMarketingCampaign$Kind;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Kind Kind(String rawValue) {
            rawValue.getClass();
            return Kind.INSTANCE.init(rawValue);
        }

        public final TextStyle TextStyle(String rawValue) {
            rawValue.getClass();
            return TextStyle.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    public EHomePageMarketingCampaign(String str, String str2, String str3, URI uri, URI uri2, URI uri3, String str4, TextStyle textStyle, Kind kind, boolean z, boolean z2, boolean z3, String str5, String str6, String str7, boolean z4) {
        str2.getClass();
        str3.getClass();
        uri.getClass();
        textStyle.getClass();
        kind.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, uri, uri2, uri3, str4, textStyle, kind, z, z2, z3, str5, str6, str7, z4);
    }

    public EHomePageMarketingCampaign(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private EHomePageMarketingCampaign(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}
