package com.polymarket.usviewmodels;

import com.polymarket.data.APIEventTag;
import com.polymarket.data.APIMoreTab;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Hasher;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001c\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0011\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0003 !\"¨\u0006#"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeCategory;", "Lskip/lib/Identifiable;", "", "Lskip/lib/SwiftProjecting;", "<init>", "()V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", "className", "displayName", "getDisplayName", "Swift_displayName", "slug", "getSlug", "Swift_slug", "imageURL", "Ljava/net/URI;", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "HomeCase", "TabCase", "MoreComingCase", "Companion", "Lcom/polymarket/usviewmodels/USHomeCategory$HomeCase;", "Lcom/polymarket/usviewmodels/USHomeCategory$MoreComingCase;", "Lcom/polymarket/usviewmodels/USHomeCategory$TabCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class USHomeCategory implements Identifiable<String>, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final USHomeCategory home = new HomeCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeCategory$HomeCase;", "Lcom/polymarket/usviewmodels/USHomeCategory;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class HomeCase extends USHomeCategory {
        public HomeCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeCategory$MoreComingCase;", "Lcom/polymarket/usviewmodels/USHomeCategory;", "associated0", "Lcom/polymarket/data/APIMoreTab;", "<init>", "(Lcom/polymarket/data/APIMoreTab;)V", "getAssociated0", "()Lcom/polymarket/data/APIMoreTab;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MoreComingCase extends USHomeCategory {
        private final APIMoreTab associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoreComingCase(APIMoreTab aPIMoreTab) {
            super(null);
            aPIMoreTab.getClass();
            this.associated0 = aPIMoreTab;
        }

        public boolean equals(Object other) {
            if (!(other instanceof MoreComingCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((MoreComingCase) other).associated0);
        }

        public final APIMoreTab getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeCategory$TabCase;", "Lcom/polymarket/usviewmodels/USHomeCategory;", "associated0", "Lcom/polymarket/data/APIEventTag;", "<init>", "(Lcom/polymarket/data/APIEventTag;)V", "getAssociated0", "()Lcom/polymarket/data/APIEventTag;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class TabCase extends USHomeCategory {
        private final APIEventTag associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TabCase(APIEventTag aPIEventTag) {
            super(null);
            aPIEventTag.getClass();
            this.associated0 = aPIEventTag;
        }

        public boolean equals(Object other) {
            if (!(other instanceof TabCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((TabCase) other).associated0);
        }

        public final APIEventTag getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    public /* synthetic */ USHomeCategory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native String Swift_displayName(String className);

    private final native String Swift_id(String className);

    private final native URI Swift_imageURL(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_slug(String className);

    public static final /* synthetic */ USHomeCategory access$getHome$cp() {
        return home;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getDisplayName() {
        return Swift_displayName(getClass().getName());
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(getClass().getName());
    }

    public final URI getImageURL() {
        return Swift_imageURL(getClass().getName());
    }

    public final String getSlug() {
        return Swift_slug(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeCategory$Companion;", "", "<init>", "()V", "home", "Lcom/polymarket/usviewmodels/USHomeCategory;", "getHome", "()Lcom/polymarket/usviewmodels/USHomeCategory;", "tab", "associated0", "Lcom/polymarket/data/APIEventTag;", "moreComing", "Lcom/polymarket/data/APIMoreTab;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final USHomeCategory getHome() {
            return USHomeCategory.access$getHome$cp();
        }

        public final USHomeCategory moreComing(APIMoreTab associated0) {
            associated0.getClass();
            return new MoreComingCase(associated0);
        }

        public final USHomeCategory tab(APIEventTag associated0) {
            associated0.getClass();
            return new TabCase(associated0);
        }

        private Companion() {
        }
    }

    private USHomeCategory() {
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }
}
