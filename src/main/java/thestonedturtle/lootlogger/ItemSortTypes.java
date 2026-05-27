package thestonedturtle.lootlogger;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ItemSortTypes
{
	ALPHABETICAL("Alphabetical"),
	ITEM_ID("Item ID"),
	TOTAL_VALUE("Total value"),
	INDIVIDUAL_VALUE("Individual value");

	private final String name;

	@Override
	public String toString()
	{
		return name;
	}
}
