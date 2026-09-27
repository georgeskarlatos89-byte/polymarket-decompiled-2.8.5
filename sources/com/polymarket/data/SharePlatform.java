package com.polymarket.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/polymarket/data/SharePlatform;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "isInstagram", "", "()Z", "Swift_isInstagram", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "InstagramCase", "XCase", "DownloadCase", "CopyCase", "MessagesCase", "MoreCase", "Companion", "Lcom/polymarket/data/SharePlatform$CopyCase;", "Lcom/polymarket/data/SharePlatform$DownloadCase;", "Lcom/polymarket/data/SharePlatform$InstagramCase;", "Lcom/polymarket/data/SharePlatform$MessagesCase;", "Lcom/polymarket/data/SharePlatform$MoreCase;", "Lcom/polymarket/data/SharePlatform$XCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SharePlatform implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SharePlatform x = new XCase();
    private static final SharePlatform download = new DownloadCase();
    private static final SharePlatform copy = new CopyCase();
    private static final SharePlatform messages = new MessagesCase();
    private static final SharePlatform more = new MoreCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/SharePlatform$CopyCase;", "Lcom/polymarket/data/SharePlatform;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CopyCase extends SharePlatform {
        public CopyCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/SharePlatform$DownloadCase;", "Lcom/polymarket/data/SharePlatform;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DownloadCase extends SharePlatform {
        public DownloadCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/SharePlatform$InstagramCase;", "Lcom/polymarket/data/SharePlatform;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "facebookAppId", "getFacebookAppId", "equals", "", "other", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InstagramCase extends SharePlatform {
        private final String associated0;
        private final String facebookAppId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstagramCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.facebookAppId = str;
        }

        public boolean equals(Object other) {
            if (!(other instanceof InstagramCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((InstagramCase) other).associated0);
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getFacebookAppId() {
            return this.facebookAppId;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/SharePlatform$MessagesCase;", "Lcom/polymarket/data/SharePlatform;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MessagesCase extends SharePlatform {
        public MessagesCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/SharePlatform$MoreCase;", "Lcom/polymarket/data/SharePlatform;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MoreCase extends SharePlatform {
        public MoreCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/SharePlatform$XCase;", "Lcom/polymarket/data/SharePlatform;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class XCase extends SharePlatform {
        public XCase() {
            super(null);
        }
    }

    public /* synthetic */ SharePlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native boolean Swift_isInstagram(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ SharePlatform access$getCopy$cp() {
        return copy;
    }

    public static final /* synthetic */ SharePlatform access$getDownload$cp() {
        return download;
    }

    public static final /* synthetic */ SharePlatform access$getMessages$cp() {
        return messages;
    }

    public static final /* synthetic */ SharePlatform access$getMore$cp() {
        return more;
    }

    public static final /* synthetic */ SharePlatform access$getX$cp() {
        return x;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean isInstagram() {
        return Swift_isInstagram(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/polymarket/data/SharePlatform$Companion;", "", "<init>", "()V", "instagram", "Lcom/polymarket/data/SharePlatform;", "facebookAppId", "", "x", "getX", "()Lcom/polymarket/data/SharePlatform;", "download", "getDownload", "copy", "getCopy", "messages", "getMessages", "more", "getMore", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SharePlatform getCopy() {
            return SharePlatform.access$getCopy$cp();
        }

        public final SharePlatform getDownload() {
            return SharePlatform.access$getDownload$cp();
        }

        public final SharePlatform getMessages() {
            return SharePlatform.access$getMessages$cp();
        }

        public final SharePlatform getMore() {
            return SharePlatform.access$getMore$cp();
        }

        public final SharePlatform getX() {
            return SharePlatform.access$getX$cp();
        }

        public final SharePlatform instagram(String facebookAppId) {
            facebookAppId.getClass();
            return new InstagramCase(facebookAppId);
        }

        private Companion() {
        }
    }

    private SharePlatform() {
    }
}
