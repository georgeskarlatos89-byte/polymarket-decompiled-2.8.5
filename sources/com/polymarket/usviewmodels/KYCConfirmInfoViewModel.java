package com.polymarket.usviewmodels;

import com.polymarket.data.TextFieldConfig;
import com.polymarket.usviewmodels.AppViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 b2\u00020\u0001:\u0003`abB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0015\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u001f\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0082 J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010$\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0082 J\u001d\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J%\u0010*\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0018H\u0082 J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010/\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0082 J\u0015\u00102\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00103\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0082 J\u0015\u00106\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00107\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0082 J\u0015\u0010:\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010;\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0082 J\u0015\u0010?\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010@\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0082 J\u001b\u0010H\u001a\b\u0012\u0004\u0012\u00020B0A2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010I\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020B0AH\u0082 J\u0015\u0010L\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010P\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010S\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010T\u001a\u00020\u0016H\u0016J\u0015\u0010U\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010V\u001a\u00020\u00162\u0006\u0010W\u001a\u00020XJ\u001d\u0010Y\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010W\u001a\u00020XH\u0082 J\u0016\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[2\u0006\u0010]\u001a\u00020^H\u0016J\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0[2\u0006\u0010]\u001a\u00020^H\u0082 R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR0\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u00182\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR4\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00182\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\u001dR0\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR$\u00100\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0011\"\u0004\b1\u0010\u0013R$\u00104\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0011\"\u0004\b5\u0010\u0013R$\u00108\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010\u0013R$\u0010<\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0011\"\u0004\b>\u0010\u0013R0\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020B0A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0011\u0010J\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bK\u0010\u0011R\u0011\u0010M\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0011\u0010Q\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bR\u0010O¨\u0006c"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "newValue", "", "isSubmitting", "()Z", "setSubmitting", "(Z)V", "Swift_isSubmitting", "Swift_isSubmitting_set", "", "value", "Lcom/polymarket/data/TextFieldConfig;", "firstName", "getFirstName", "()Lcom/polymarket/data/TextFieldConfig;", "setFirstName", "(Lcom/polymarket/data/TextFieldConfig;)V", "Swift_firstName", "Swift_firstName_set", "lastName", "getLastName", "setLastName", "Swift_lastName", "Swift_lastName_set", "Ljava/util/Date;", "birthday", "getBirthday", "setBirthday", "Swift_birthday", "Swift_birthday_set", "ssn", "getSsn", "setSsn", "Swift_ssn", "Swift_ssn_set", "isSSNFocused", "setSSNFocused", "Swift_isSSNFocused", "Swift_isSSNFocused_set", "isLoading", "setLoading", "Swift_isLoading", "Swift_isLoading_set", "isAnyFieldFocused", "setAnyFieldFocused", "Swift_isAnyFieldFocused", "Swift_isAnyFieldFocused_set", "shouldClearFocus", "getShouldClearFocus", "setShouldClearFocus", "Swift_shouldClearFocus", "Swift_shouldClearFocus_set", "", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Field;", "formFieldOrder", "getFormFieldOrder", "()Ljava/util/List;", "setFormFieldOrder", "(Ljava/util/List;)V", "Swift_formFieldOrder", "Swift_formFieldOrder_set", "allValid", "getAllValid", "Swift_allValid", "formattedAddress", "getFormattedAddress", "()Ljava/lang/String;", "Swift_formattedAddress", "displaySSN", "getDisplaySSN", "Swift_displaySSN", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Field", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KYCConfirmInfoViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ KYCConfirmInfoViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native boolean Swift_allValid(long Swift_peer);

    private final native TextFieldConfig<Date> Swift_birthday(long Swift_peer);

    private final native void Swift_birthday_set(long Swift_peer, TextFieldConfig<Date> value);

    private final native String Swift_displaySSN(long Swift_peer);

    private final native TextFieldConfig<String> Swift_firstName(long Swift_peer);

    private final native void Swift_firstName_set(long Swift_peer, TextFieldConfig<String> value);

    private final native List<Field> Swift_formFieldOrder(long Swift_peer);

    private final native void Swift_formFieldOrder_set(long Swift_peer, List<? extends Field> value);

    private final native String Swift_formattedAddress(long Swift_peer);

    private final native boolean Swift_isAnyFieldFocused(long Swift_peer);

    private final native void Swift_isAnyFieldFocused_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isSSNFocused(long Swift_peer);

    private final native void Swift_isSSNFocused_set(long Swift_peer, boolean value);

    private final native boolean Swift_isSubmitting(long Swift_peer);

    private final native void Swift_isSubmitting_set(long Swift_peer, boolean value);

    private final native TextFieldConfig<String> Swift_lastName(long Swift_peer);

    private final native void Swift_lastName_set(long Swift_peer, TextFieldConfig<String> value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_shouldClearFocus(long Swift_peer);

    private final native void Swift_shouldClearFocus_set(long Swift_peer, boolean value);

    private final native TextFieldConfig<String> Swift_ssn(long Swift_peer);

    private final native void Swift_ssn_set(long Swift_peer, TextFieldConfig<String> value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getAllValid() {
        return Swift_allValid(getSwift_peer());
    }

    public final TextFieldConfig<Date> getBirthday() {
        return Swift_birthday(getSwift_peer());
    }

    public final String getDisplaySSN() {
        return Swift_displaySSN(getSwift_peer());
    }

    public final TextFieldConfig<String> getFirstName() {
        return Swift_firstName(getSwift_peer());
    }

    public final List<Field> getFormFieldOrder() {
        return Swift_formFieldOrder(getSwift_peer());
    }

    public final String getFormattedAddress() {
        return Swift_formattedAddress(getSwift_peer());
    }

    public final TextFieldConfig<String> getLastName() {
        return Swift_lastName(getSwift_peer());
    }

    public final boolean getShouldClearFocus() {
        return Swift_shouldClearFocus(getSwift_peer());
    }

    public final TextFieldConfig<String> getSsn() {
        return Swift_ssn(getSwift_peer());
    }

    public final boolean isAnyFieldFocused() {
        return Swift_isAnyFieldFocused(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isSSNFocused() {
        return Swift_isSSNFocused(getSwift_peer());
    }

    public final boolean isSubmitting() {
        return Swift_isSubmitting(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setAnyFieldFocused(boolean z) {
        Swift_isAnyFieldFocused_set(getSwift_peer(), z);
    }

    public final void setBirthday(TextFieldConfig<Date> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_birthday_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setFirstName(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_firstName_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setFormFieldOrder(List<? extends Field> list) {
        list.getClass();
        Swift_formFieldOrder_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setLastName(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_lastName_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setSSNFocused(boolean z) {
        Swift_isSSNFocused_set(getSwift_peer(), z);
    }

    public final void setShouldClearFocus(boolean z) {
        Swift_shouldClearFocus_set(getSwift_peer(), z);
    }

    public final void setSsn(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_ssn_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setSubmitting(boolean z) {
        Swift_isSubmitting_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0082 J\u0011\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0082 J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rj\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Field;", "Lskip/lib/CaseIterable;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "firstName", "lastName", "birthday", "ssn", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", Keys.KEY_NAME, "placeholder", "getPlaceholder", "Swift_placeholder", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Field implements CaseIterable, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Field[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Field firstName = new Field("firstName", 0);
        public static final Field lastName = new Field("lastName", 1);
        public static final Field birthday = new Field("birthday", 2);
        public static final Field ssn = new Field("ssn", 3);

        private static final /* synthetic */ Field[] $values() {
            return new Field[]{firstName, lastName, birthday, ssn};
        }

        static {
            Field[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Field(String str, int i) {
        }

        private final native String Swift_placeholder(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_title(String name);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getPlaceholder() {
            return Swift_placeholder(name());
        }

        public final String getTitle() {
            return Swift_title(name());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Field$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Field;", "<init>", "()V", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<Field> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Field> getAllCases() {
                return ArrayKt.arrayOf(Field.firstName, Field.lastName, Field.birthday, Field.ssn);
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnTapAddressCase", "OnConfirmCase", "OnFirstNameChangedCase", "OnLastNameChangedCase", "OnBirthdayChangedCase", "OnSSNChangedCase", "Companion", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnBirthdayChangedCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnConfirmCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnFirstNameChangedCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnLastNameChangedCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnSSNChangedCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnTapAddressCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onTapAddress = new OnTapAddressCase();
        private static final Input onConfirm = new OnConfirmCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnBirthdayChangedCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBirthdayChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnBirthdayChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnConfirmCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnConfirmCase extends Input {
            public OnConfirmCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnFirstNameChangedCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFirstNameChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFirstNameChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnLastNameChangedCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnLastNameChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnLastNameChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnSSNChangedCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSSNChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSSNChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$OnTapAddressCase;", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTapAddressCase extends Input {
            public OnTapAddressCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnConfirm$cp() {
            return onConfirm;
        }

        public static final /* synthetic */ Input access$getOnTapAddress$cp() {
            return onTapAddress;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input$Companion;", "", "<init>", "()V", "onTapAddress", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input;", "getOnTapAddress", "()Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Input;", "onConfirm", "getOnConfirm", "onFirstNameChanged", "associated0", "", "onLastNameChanged", "onBirthdayChanged", "onSSNChanged", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnConfirm() {
                return Input.access$getOnConfirm$cp();
            }

            public final Input getOnTapAddress() {
                return Input.access$getOnTapAddress$cp();
            }

            public final Input onBirthdayChanged(String associated0) {
                associated0.getClass();
                return new OnBirthdayChangedCase(associated0);
            }

            public final Input onFirstNameChanged(String associated0) {
                associated0.getClass();
                return new OnFirstNameChangedCase(associated0);
            }

            public final Input onLastNameChanged(String associated0) {
                associated0.getClass();
                return new OnLastNameChangedCase(associated0);
            }

            public final Input onSSNChanged(String associated0) {
                associated0.getClass();
                return new OnSSNChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "mock", "Lcom/polymarket/usviewmodels/KYCConfirmInfoViewModel;", "Swift_Companion_mock_3", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(AppSceneType scene, String id);

        private final native KYCConfirmInfoViewModel Swift_Companion_mock_3();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_0(appSceneType, str);
        }

        public final KYCConfirmInfoViewModel mock() {
            return Swift_Companion_mock_3();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCConfirmInfoViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public KYCConfirmInfoViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
