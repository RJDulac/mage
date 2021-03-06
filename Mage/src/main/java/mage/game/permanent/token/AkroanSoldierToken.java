

package mage.game.permanent.token;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.MageInt;
import mage.abilities.keyword.HasteAbility;

/**
 *
 * @author spjspj
 */
public final class AkroanSoldierToken extends TokenImpl {

    public AkroanSoldierToken() {
        super("Soldier", "1/1 red Soldier creature token with haste");
        setTokenType(3);
        cardType.add(CardType.CREATURE);
        color.setRed(true);
        subtype.add(SubType.SOLDIER);
        power = new MageInt(1);
        toughness = new MageInt(1);
        this.addAbility(HasteAbility.getInstance());
    }

    public AkroanSoldierToken(final AkroanSoldierToken token) {
        super(token);
    }

    public AkroanSoldierToken copy() {
        return new AkroanSoldierToken(this);
    }
}
