package com.polymarket.usviewmodels;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u001cB\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001d"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "messages", "whatsApp", "instagramStory", "snapchat", "xTwitter", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsInviteChannel implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SquadsInviteChannel[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final SquadsInviteChannel messages = new SquadsInviteChannel("messages", 0, "messages", null, 2, null);
    public static final SquadsInviteChannel whatsApp = new SquadsInviteChannel("whatsApp", 1, "whatsApp", null, 2, null);
    public static final SquadsInviteChannel instagramStory = new SquadsInviteChannel("instagramStory", 2, "instagramStory", null, 2, null);
    public static final SquadsInviteChannel snapchat = new SquadsInviteChannel("snapchat", 3, "snapchat", null, 2, null);
    public static final SquadsInviteChannel xTwitter = new SquadsInviteChannel("xTwitter", 4, "xTwitter", null, 2, null);

    private static final /* synthetic */ SquadsInviteChannel[] $values() {
        return new SquadsInviteChannel[]{messages, whatsApp, instagramStory, snapchat, xTwitter};
    }

    static {
        SquadsInviteChannel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ SquadsInviteChannel(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_title(String name);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SquadsInviteChannel valueOf(String str) {
        return (SquadsInviteChannel) Enum.valueOf(SquadsInviteChannel.class, str);
    }

    public static SquadsInviteChannel[] values() {
        return (SquadsInviteChannel[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public final String getTitle() {
        return Swift_title(name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0082 J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteChannel$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "<init>", "()V", "inviteDisplayOrder", "", "getInviteDisplayOrder", "()Ljava/util/List;", "Swift_Companion_inviteDisplayOrder", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion implements CaseIterableCompanion<SquadsInviteChannel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native List<SquadsInviteChannel> Swift_Companion_inviteDisplayOrder();

        @Override // skip.lib.CaseIterableCompanion
        public Array<SquadsInviteChannel> getAllCases() {
            return ArrayKt.arrayOf(SquadsInviteChannel.messages, SquadsInviteChannel.whatsApp, SquadsInviteChannel.instagramStory, SquadsInviteChannel.snapchat, SquadsInviteChannel.xTwitter);
        }

        public final List<SquadsInviteChannel> getInviteDisplayOrder() {
            return Swift_Companion_inviteDisplayOrder();
        }

        public final SquadsInviteChannel init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -567850277:
                    if (!rawValue.equals("xTwitter")) {
                        return null;
                    }
                    return SquadsInviteChannel.xTwitter;
                case -462094004:
                    if (rawValue.equals("messages")) {
                        return SquadsInviteChannel.messages;
                    }
                    return null;
                case 284397090:
                    if (rawValue.equals("snapchat")) {
                        return SquadsInviteChannel.snapchat;
                    }
                    return null;
                case 1348075619:
                    if (rawValue.equals("instagramStory")) {
                        return SquadsInviteChannel.instagramStory;
                    }
                    return null;
                case 1934750066:
                    if (rawValue.equals("whatsApp")) {
                        return SquadsInviteChannel.whatsApp;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private SquadsInviteChannel(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
