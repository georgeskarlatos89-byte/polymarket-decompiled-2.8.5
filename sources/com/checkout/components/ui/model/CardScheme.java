package com.checkout.components.ui.model;

import com.polymarket.android.R;
import defpackage.eb4;
import defpackage.nyd;
import defpackage.oyd;
import defpackage.pyd;
import defpackage.ug7;
import defpackage.vzg;
import defpackage.ww4;
import defpackage.x83;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019BM\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/checkout/components/ui/model/CardScheme;", "", "", "", "cvvLength", "", "Lpyd;", "patterns", "numberSeparatorPattern", "lengths", "imageId", "<init>", "(Ljava/lang/String;ILjava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "Ljava/util/Set;", "getCvvLength", "()Ljava/util/Set;", "Ljava/util/List;", "getPatterns$ui_standardRelease", "()Ljava/util/List;", "getNumberSeparatorPattern", "getLengths", "Ljava/lang/Integer;", "getImageId", "()Ljava/lang/Integer;", "Companion", "x83", "MADA", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DINERS_CLUB", "DISCOVER", "JCB", "UNION_PAY", "MAESTRO", "CARTES_BANCAIRES", "UNKNOWN", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CardScheme {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ CardScheme[] $VALUES;
    public static final x83 Companion;
    private final Set<Integer> cvvLength;
    private final Integer imageId;
    private final List<Integer> lengths;
    private final List<Integer> numberSeparatorPattern;
    private final List<pyd> patterns;
    public static final CardScheme MADA = new CardScheme("MADA", 0, vzg.b(3), CollectionsKt.listOf(new nyd(400861), new nyd(401757), new nyd(403024), new nyd(406136), new nyd(406996), new nyd(407197), new nyd(407395), new nyd(409201), new nyd(412565), new nyd(410621), new nyd(410685), new nyd(417633), new nyd(419593), new nyd(420132), new nyd(421141), new nyd(426897), new nyd(428331), new nyd(431361), new nyd(432328), new nyd(434107), new nyd(439954), new nyd(440533), new nyd(440647), new nyd(440795), new nyd(445564), new nyd(446393), new nyd(446404), new nyd(446672), new nyd(455036), new nyd(455708), new nyd(457865), new nyd(457997), new nyd(458456), new nyd(462220), new nyd(474491), new nyd(484783), new nyd(493428), new nyd(504300), new nyd(506968), new nyd(508160), new nyd(513213), new nyd(520058), new nyd(521076), new nyd(524130), new nyd(524514), new nyd(529415), new nyd(529741), new nyd(530060), new nyd(530906), new nyd(531095), new nyd(531196), new nyd(532013), new nyd(535825), new nyd(535989), new nyd(536023), new nyd(537767), new nyd(539931), new nyd(543085), new nyd(543357), new nyd(549760), new nyd(554180), new nyd(557606), new nyd(558563), new nyd(558848), new nyd(585265), new nyd(589005), new nyd(589206), new nyd(604906), new nyd(605141), new nyd(636120), new oyd(428671, 428673), new oyd(468540, 468543), new oyd(483010, 483012), new oyd(486094, 486096), new oyd(489317, 489319), new oyd(588845, 588851), new oyd(588982, 588983), new oyd(422817, 422819), new oyd(968201, 968211)), CollectionsKt.listOf(4, 8, 12), eb4.c(16), 2131230897);
    public static final CardScheme VISA = new CardScheme("VISA", 1, vzg.b(3), eb4.c(new nyd(4)), CollectionsKt.listOf(4, 8, 12, 16), CollectionsKt.listOf(13, 16, 18, 19), 2131230901);
    public static final CardScheme MASTERCARD = new CardScheme("MASTERCARD", 2, vzg.b(3), CollectionsKt.listOf(new oyd(51, 55), new oyd(222, 229), new oyd(23, 26), new oyd(270, 271), new nyd(2720)), CollectionsKt.listOf(4, 8, 12), eb4.c(16), 2131230899);
    public static final CardScheme AMERICAN_EXPRESS = new CardScheme("AMERICAN_EXPRESS", 3, vzg.b(4), CollectionsKt.listOf(new nyd(34), new nyd(37)), CollectionsKt.listOf(4, 10), eb4.c(15), 2131230892);
    public static final CardScheme DINERS_CLUB = new CardScheme("DINERS_CLUB", 4, vzg.b(3), CollectionsKt.listOf(new nyd(30), new nyd(36), new nyd(38), new nyd(39), new oyd(300, 305), new oyd(380, 389), new oyd(360, 369)), CollectionsKt.listOf(4, 10), CollectionsKt.listOf(14, 16, 19), Integer.valueOf(R.drawable.cko_ic_scheme_diners));
    public static final CardScheme DISCOVER = new CardScheme("DISCOVER", 5, vzg.b(3), CollectionsKt.listOf(new nyd(6011), new nyd(65), new nyd(601174), new oyd(601177, 601179), new oyd(601186, 601199), new oyd(644000, 659999), new oyd(601100, 601109), new oyd(601120, 601149), new oyd(644, 649)), CollectionsKt.listOf(4, 8, 12), CollectionsKt.listOf(16, 19), Integer.valueOf(R.drawable.cko_ic_scheme_discover));
    public static final CardScheme JCB = new CardScheme("JCB", 6, vzg.b(3), CollectionsKt.listOf(new nyd(2131), new nyd(1800), new oyd(3528, 3589)), CollectionsKt.listOf(4, 8, 12), CollectionsKt.listOf(16, 17, 18, 19), Integer.valueOf(R.drawable.cko_ic_scheme_jcb));
    public static final CardScheme UNION_PAY = new CardScheme("UNION_PAY", 7, vzg.b(3), CollectionsKt.listOf(new nyd(620), new nyd(622018), new nyd(6270), new nyd(6272), new nyd(6276), new nyd(6291), new nyd(6292), new nyd(810), new oyd(8110, 8131), new oyd(8132, 8151), new oyd(8152, 8163), new oyd(8164, 8171), new oyd(62100, 62182), new oyd(62184, 62187), new oyd(62185, 62197), new oyd(62200, 62205), new oyd(622010, 622999), new oyd(627700, 627779), new oyd(627781, 627799), new oyd(6282, 6289), new oyd(62207, 62209), new oyd(623, 626)), CollectionsKt.listOf(4, 8, 12), CollectionsKt.listOf(14, 15, 16, 17, 18, 19), Integer.valueOf(R.drawable.cko_ic_scheme_union_pay));
    public static final CardScheme MAESTRO = new CardScheme("MAESTRO", 8, vzg.b(3), CollectionsKt.listOf(new nyd(493698), new oyd(56, 59), new nyd(63), new nyd(67), new nyd(6), new oyd(500000, 504174), new oyd(504176, 506698), new oyd(506779, 508999)), CollectionsKt.listOf(4, 8, 12), CollectionsKt.listOf(12, 13, 14, 15, 16, 17, 18, 19), 2131230898);
    public static final CardScheme CARTES_BANCAIRES = new CardScheme("CARTES_BANCAIRES", 9, ArraysKt.l0(new Integer[]{3, 4}), CollectionsKt.emptyList(), CollectionsKt.listOf(4, 8, 12, 16), CollectionsKt.listOf(13, 16, 18, 19), 2131230893);
    public static final CardScheme UNKNOWN = new CardScheme("UNKNOWN", 10, ArraysKt.l0(new Integer[]{3, 4}), CollectionsKt.emptyList(), CollectionsKt.listOf(4, 8, 12, 16), CollectionsKt.listOf(13, 16, 18, 19), null, 16, null);

    private static final /* synthetic */ CardScheme[] $values() {
        return new CardScheme[]{MADA, VISA, MASTERCARD, AMERICAN_EXPRESS, DINERS_CLUB, DISCOVER, JCB, UNION_PAY, MAESTRO, CARTES_BANCAIRES, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v119, types: [x83, java.lang.Object] */
    static {
        CardScheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CardScheme(String str, int i, Set set, List list, List list2, List list3, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, set, list, list2, list3, r8);
        Integer num2;
        if ((i2 & 16) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static CardScheme valueOf(String str) {
        return (CardScheme) Enum.valueOf(CardScheme.class, str);
    }

    public static CardScheme[] values() {
        return (CardScheme[]) $VALUES.clone();
    }

    public final Set<Integer> getCvvLength() {
        return this.cvvLength;
    }

    public final Integer getImageId() {
        return this.imageId;
    }

    public final List<Integer> getLengths() {
        return this.lengths;
    }

    public final List<Integer> getNumberSeparatorPattern() {
        return this.numberSeparatorPattern;
    }

    public final List<pyd> getPatterns$ui_standardRelease() {
        return this.patterns;
    }

    private CardScheme(String str, int i, Set set, List list, List list2, List list3, Integer num) {
        this.cvvLength = set;
        this.patterns = list;
        this.numberSeparatorPattern = list2;
        this.lengths = list3;
        this.imageId = num;
    }
}
