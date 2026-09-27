package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.ESquad;
import com.polymarket.usviewmodels.AppViewModel;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.k2h;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 B2\u00020\u0001:\u0005>?@ABB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0019\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\"\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010&\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010)\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010,\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00102\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u000206J\u001d\u00107\u001a\u0002042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00105\u001a\u000206H\u0082 J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010;\u001a\u00020<H\u0016J\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010;\u001a\u00020<H\u0082 R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b#\u0010%R\u0011\u0010'\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010\u0013R\u0011\u0010*\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010\u0013R\u0011\u0010-\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b.\u0010\u0013R\u0011\u00100\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b1\u0010%¨\u0006C"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "group", "Lcom/polymarket/data/ESquad;", "avatar", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Callbacks;", "(Lcom/polymarket/data/ESquad;Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Callbacks;)V", Keys.KEY_NAME, "", "getName", "()Ljava/lang/String;", "Swift_name", "avatarSelection", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$AvatarSelection;", "getAvatarSelection", "()Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$AvatarSelection;", "Swift_avatarSelection", "customAvatarImage", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage;", "getCustomAvatarImage", "()Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage;", "Swift_customAvatarImage", "contentForDefaultAvatar", "getContentForDefaultAvatar", "()Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "Swift_contentForDefaultAvatar", "isSaving", "", "()Z", "Swift_isSaving", "squadNameLabel", "getSquadNameLabel", "Swift_squadNameLabel", "namePlaceholder", "getNamePlaceholder", "Swift_namePlaceholder", "resolvedName", "getResolvedName", "Swift_resolvedName", "canSave", "getCanSave", "Swift_canSave", "sendInput", "", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input;", "Swift_sendInput_1", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "AvatarSelection", "CustomAvatarImage", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsEditProfileViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$AvatarSelection;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "default", "custom", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class AvatarSelection implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ AvatarSelection[] $VALUES;

        /* renamed from: default, reason: not valid java name */
        public static final AvatarSelection f15default = new AvatarSelection("default", 0);
        public static final AvatarSelection custom = new AvatarSelection("custom", 1);

        private static final /* synthetic */ AvatarSelection[] $values() {
            return new AvatarSelection[]{f15default, custom};
        }

        static {
            AvatarSelection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private AvatarSelection(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static AvatarSelection valueOf(String str) {
            return (AvatarSelection) Enum.valueOf(AvatarSelection.class, str);
        }

        public static AvatarSelection[] values() {
            return (AvatarSelection[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsEditProfileViewModel(ESquad eSquad, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, eSquad, squadsProfileAvatarPresentation, callbacks), (SwiftPeerMarker) null);
        eSquad.getClass();
        squadsProfileAvatarPresentation.getClass();
        callbacks.getClass();
    }

    private final native AvatarSelection Swift_avatarSelection(long Swift_peer);

    private final native boolean Swift_canSave(long Swift_peer);

    private final native SquadsProfileAvatarPresentation Swift_contentForDefaultAvatar(long Swift_peer);

    private final native CustomAvatarImage Swift_customAvatarImage(long Swift_peer);

    private final native boolean Swift_isSaving(long Swift_peer);

    private final native String Swift_name(long Swift_peer);

    private final native String Swift_namePlaceholder(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_resolvedName(long Swift_peer);

    private final native void Swift_sendInput_1(long Swift_peer, Input input);

    private final native String Swift_squadNameLabel(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final AvatarSelection getAvatarSelection() {
        return Swift_avatarSelection(getSwift_peer());
    }

    public final boolean getCanSave() {
        return Swift_canSave(getSwift_peer());
    }

    public final SquadsProfileAvatarPresentation getContentForDefaultAvatar() {
        return Swift_contentForDefaultAvatar(getSwift_peer());
    }

    public final CustomAvatarImage getCustomAvatarImage() {
        return Swift_customAvatarImage(getSwift_peer());
    }

    public final String getName() {
        return Swift_name(getSwift_peer());
    }

    public final String getNamePlaceholder() {
        return Swift_namePlaceholder(getSwift_peer());
    }

    public final String getResolvedName() {
        return Swift_resolvedName(getSwift_peer());
    }

    public final String getSquadNameLabel() {
        return Swift_squadNameLabel(getSwift_peer());
    }

    public final boolean isSaving() {
        return Swift_isSaving(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_1(getSwift_peer(), input);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "RemoteCase", "DataCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage$DataCase;", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage$RemoteCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class CustomAvatarImage implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage$DataCase;", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage;", "associated0", "", "<init>", "([B)V", "getAssociated0", "()[B", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class DataCase extends CustomAvatarImage {
            private final byte[] associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DataCase(byte[] bArr) {
                super(null);
                bArr.getClass();
                this.associated0 = bArr;
            }

            public boolean equals(Object other) {
                if (!(other instanceof DataCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((DataCase) other).associated0);
            }

            public final byte[] getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage$RemoteCase;", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class RemoteCase extends CustomAvatarImage {
            private final URI associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteCase(URI uri) {
                super(null);
                uri.getClass();
                this.associated0 = uri;
            }

            public boolean equals(Object other) {
                if (!(other instanceof RemoteCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((RemoteCase) other).associated0);
            }

            public final URI getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ CustomAvatarImage(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage$Companion;", "", "<init>", "()V", "remote", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$CustomAvatarImage;", "associated0", "Ljava/net/URI;", ApiConstant.KEY_DATA, "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CustomAvatarImage data(byte[] associated0) {
                associated0.getClass();
                return new DataCase(associated0);
            }

            public final CustomAvatarImage remote(URI associated0) {
                associated0.getClass();
                return new RemoteCase(associated0);
            }

            private Companion() {
            }
        }

        private CustomAvatarImage() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnNameChangedCase", "OnAvatarImageSelectedCase", "OnRemoveAvatarSelectionCase", "OnSaveCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input$OnAvatarImageSelectedCase;", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input$OnNameChangedCase;", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input$OnRemoveAvatarSelectionCase;", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input$OnSaveCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onRemoveAvatarSelection = new OnRemoveAvatarSelectionCase();
        private static final Input onSave = new OnSaveCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input$OnAvatarImageSelectedCase;", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input;", "associated0", "", "<init>", "([B)V", "getAssociated0", "()[B", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAvatarImageSelectedCase extends Input {
            private final byte[] associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnAvatarImageSelectedCase(byte[] bArr) {
                super(null);
                bArr.getClass();
                this.associated0 = bArr;
            }

            public final byte[] getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input$OnNameChangedCase;", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnNameChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnNameChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input$OnRemoveAvatarSelectionCase;", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRemoveAvatarSelectionCase extends Input {
            public OnRemoveAvatarSelectionCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input$OnSaveCase;", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSaveCase extends Input {
            public OnSaveCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnRemoveAvatarSelection$cp() {
            return onRemoveAvatarSelection;
        }

        public static final /* synthetic */ Input access$getOnSave$cp() {
            return onSave;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input$Companion;", "", "<init>", "()V", "onNameChanged", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input;", "associated0", "", "onAvatarImageSelected", "", "onRemoveAvatarSelection", "getOnRemoveAvatarSelection", "()Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Input;", "onSave", "getOnSave", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnRemoveAvatarSelection() {
                return Input.access$getOnRemoveAvatarSelection$cp();
            }

            public final Input getOnSave() {
                return Input.access$getOnSave$cp();
            }

            public final Input onAvatarImageSelected(byte[] associated0) {
                associated0.getClass();
                return new OnAvatarImageSelectedCase(associated0);
            }

            public final Input onNameChanged(String associated0) {
                associated0.getClass();
                return new OnNameChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0006\u0010\r\u001a\u00020\u000eJ\t\u0010\u000f\u001a\u00020\u000eH\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "group", "Lcom/polymarket/data/ESquad;", "avatar", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel;", "Swift_Companion_mock_2", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(ESquad group, SquadsProfileAvatarPresentation avatar, Callbacks callbacks);

        private final native SquadsEditProfileViewModel Swift_Companion_mock_2();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, ESquad eSquad, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(eSquad, squadsProfileAvatarPresentation, callbacks);
        }

        public final SquadsEditProfileViewModel mock() {
            return Swift_Companion_mock_2();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\fJ\u0015\u0010\u0013\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u001f\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/SquadsEditProfileViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onCompleted", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnCompleted", "()Lkotlin/jvm/functions/Function0;", "Swift_onCompleted", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(Function0<Unit> function0) {
            function0.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0);
        }

        private final native long Swift_constructor_0(Function0<Unit> onCompleted);

        private final native Function0<Unit> Swift_onCompleted(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$0();
        }

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
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

        public final Function0<Unit> getOnCompleted() {
            return Swift_onCompleted(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Callbacks(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new k2h(25) : function0);
        }
    }

    public SquadsEditProfileViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ SquadsEditProfileViewModel(ESquad eSquad, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eSquad, squadsProfileAvatarPresentation, (i & 4) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }
}
