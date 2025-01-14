package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.UnPaidCommand;

public class UnPaidCommandParserTest {

    private UnPaidCommandParser parser = new UnPaidCommandParser();

    @Test
    public void parse_validArgs_returnsUnpaidCommand() {
        assertParseSuccess(parser, "1", new UnPaidCommand(INDEX_FIRST_PERSON));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "dfass", String.format(MESSAGE_INVALID_COMMAND_FORMAT, UnPaidCommand.MESSAGE_USAGE));
    }
}
