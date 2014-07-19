package truco.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Card {

	private Integer number;
	private Suit suit;
	
	
	public Card(Integer number, Suit suit) {
		this.number = number;
		this.suit = suit;
	}


	public Integer getNumber() {
		return number;
	}


	public Suit getSuit() {
		return suit;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
	
	
}
